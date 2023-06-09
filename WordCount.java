import edu.umd.cloud9.io.pair.PairOfStrings;
import edu.umd.cloud9.io.pair.PairOfInts;
import edu.umd.cloud9.io.SequenceFileUtils;
import edu.umd.cloud9.mapreduce.MapReduceDriver;
import edu.umd.cloud9.mapreduce.lib.input.SequenceFileInputFormat;
import edu.umd.cloud9.mapreduce.lib.output.SequenceFileOutputFormat;

import java.io.IOException;
import java.util.StringTokenizer;

public class WordCount {
    public static class WordCounterMapper extends Mapper<PairOfStrings, PairOfStrings, PairOfStrings, PairOfInts> {
        private final static PairOfStrings pair = new PairOfStrings();
        private final static PairOfInts intPair = new PairOfInts(1);

        @Override
        public void map(PairOfStrings key, PairOfStrings value, Context context)
                throws IOException, InterruptedException {
            StringTokenizer tokenizer = new StringTokenizer(value.getRightElement());
            while (tokenizer.hasMoreTokens()) {
                pair.set(tokenizer.nextToken(), key.getLeftElement());
                context.write(pair, intPair);
            }
        }
    }

    public static class WordCountReducer extends Reducer<PairOfStrings, PairOfInts, PairOfStrings, PairOfInts> {
        private final static PairOfInts result = new PairOfInts();

        @Override
        public void reduce(PairOfStrings key, Iterable<PairOfInts> values, Context context)
                throws IOException, InterruptedException {
            int sum = 0;
            for (PairOfInts value : values) {
                sum += value.getRightElement();
            }
            result.set(sum);
            context.write(key, result);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.err.println("Usage: WordCount <input path> <output path>");
            System.exit(-1);
        }

        String inputPath = args[0];
        String outputPath = args[1];

        MapReduceDriver<PairOfStrings, PairOfStrings, PairOfStrings, PairOfInts, PairOfStrings, PairOfInts> driver = new MapReduceDriver<>(
                WordCounterMapper.class, WordCountReducer.class);

        driver.setJobName("WordCount");
        driver.setInputFormatClass(SequenceFileInputFormat.class);
        driver.setOutputFormatClass(SequenceFileOutputFormat.class);
        driver.setMapperClass(WordCounterMapper.class);
        driver.setReducerClass(WordCountReducer.class);
        driver.setMapOutputKeyClass(PairOfStrings.class);
        driver.setMapOutputValueClass(PairOfInts.class);
        driver.setOutputKeyClass(PairOfStrings.class);
        driver.setOutputValueClass(PairOfInts.class);

        driver.run(inputPath, outputPath);
    }
}

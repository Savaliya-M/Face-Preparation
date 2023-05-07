import java.util.Arrays;

public class LinearRegression {
    public static void main(String[] args) {

        String[] destinations = { "Delhi", "Indore", "Raipur", "Kolkata", "Chennai", "Jaipur", "Nagpur" };
        double[] distances = { 1000, 300, 600, 1500, 1800, 600, 300 };
        double[] airFares = { 6000, 2000, 5000, 7000, 8000, 5000, 3000 };

        double distanceMean = mean(distances);
        double airFareMean = mean(airFares);

        double numerator = 0;
        double denominator = 0;
        for (int i = 0; i < distances.length; i++) {
            numerator += (distances[i] - distanceMean) * (airFares[i] - airFareMean);
            denominator += Math.pow(distances[i] - distanceMean, 2);
        }
        double slope = numerator / denominator;

        double yIntercept = airFareMean - slope * distanceMean;

        System.out.printf("Air Fare = %.3f * distance + %.3f%n", slope, yIntercept);
    }

    public static double mean(double[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}

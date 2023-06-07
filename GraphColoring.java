
import java.util.*;

public class GraphColoring {

    private int numVertices;
    private int[] colors;
    private boolean[][] adjacencyMatrix;

    public GraphColoring(int numVertices) {
        this.numVertices = numVertices;
        colors = new int[numVertices];
        adjacencyMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int u, int v) {
        adjacencyMatrix[u][v] = true;
        adjacencyMatrix[v][u] = true;
    }

    public void colorGraph() {
        for (int vertex = 0; vertex < numVertices; vertex++) {
            int color = 1;
            while (!isColorAvailable(vertex, color)) {
                color++;
            }
            colors[vertex] = color;
        }
        System.out.println(Arrays.toString(colors));
    }

    private boolean isColorAvailable(int vertex, int color) {
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[vertex][i] && color == colors[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        GraphColoring graph = new GraphColoring(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.colorGraph();
    }
}

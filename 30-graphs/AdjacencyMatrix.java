import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Vertices (0-100): "); int n = in.nextInt();
        if (n < 0 || n > 100) { System.out.println("Invalid vertex count."); return; }
        int[][] matrix = new int[n][n];
        System.out.print("Edges (0-10000): "); int m = in.nextInt();
        if (m < 0 || m > 10000 || (n == 0 && m > 0)) { System.out.println("Invalid edge count."); return; }
        System.out.println("Enter undirected edge pairs using vertices 0 to " + Math.max(0, n - 1) + ":");
        for (int i = 0; i < m; i++) {
            int a = in.nextInt(), b = in.nextInt();
            if (a < 0 || a >= n || b < 0 || b >= n) { System.out.println("Invalid endpoint."); return; }
            matrix[a][b] = matrix[b][a] = 1;
        }
        System.out.println("Adjacency matrix:");
        for (int[] row : matrix) {
            for (int value : row) System.out.print(value + " ");
            System.out.println();
        }
    }
}

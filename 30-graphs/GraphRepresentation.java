import java.util.Scanner;

public class GraphRepresentation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of vertices (0-100): ");
        int vertexCount = input.nextInt();
        if (vertexCount < 0 || vertexCount > 100) {
            System.out.println("Vertex count must be between 0 and 100.");
            return;
        }

        System.out.print("Number of edges (0-10000): ");
        int edgeCount = input.nextInt();
        if (edgeCount < 0 || edgeCount > 10000 || (vertexCount == 0 && edgeCount > 0)) {
            System.out.println("Invalid edge count for this graph.");
            return;
        }

        int[] from = new int[edgeCount];
        int[] to = new int[edgeCount];
        System.out.println("Enter each undirected edge as two vertex numbers (0 to "
                + Math.max(0, vertexCount - 1) + "):");
        for (int i = 0; i < edgeCount; i++) {
            from[i] = input.nextInt();
            to[i] = input.nextInt();
            if (from[i] < 0 || from[i] >= vertexCount || to[i] < 0 || to[i] >= vertexCount) {
                System.out.println("Edge endpoints must name existing vertices.");
                return;
            }
        }

        System.out.print("Vertices: ");
        for (int i = 0; i < vertexCount; i++) System.out.print(i + " ");
        System.out.println("\nEdges:");
        if (edgeCount == 0) System.out.println("(none)");
        for (int i = 0; i < edgeCount; i++) {
            System.out.println(from[i] + " -- " + to[i]);
        }
    }
}

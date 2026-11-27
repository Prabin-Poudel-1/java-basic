import java.util.Scanner;

public class PostorderTraversal {
    private static void postorder(int[] tree, int index) {
        if (index >= tree.length) return;
        postorder(tree, 2 * index + 1);
        postorder(tree, 2 * index + 2);
        System.out.print(tree[index] + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of nodes (0-100): ");
        int count = input.nextInt();
        if (count < 0 || count > 100) {
            System.out.println("Node count must be between 0 and 100.");
            return;
        }

        int[] tree = new int[count];
        System.out.println("Enter node values in level order:");
        for (int i = 0; i < count; i++) tree[i] = input.nextInt();

        System.out.print("Postorder traversal: ");
        if (count == 0) System.out.println("(empty)");
        else {
            postorder(tree, 0);
            System.out.println();
        }
    }
}

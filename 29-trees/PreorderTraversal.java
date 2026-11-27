import java.util.Scanner;

public class PreorderTraversal {
    private static void preorder(int[] tree, int index) {
        if (index >= tree.length) return;
        System.out.print(tree[index] + " ");
        preorder(tree, 2 * index + 1);
        preorder(tree, 2 * index + 2);
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

        System.out.print("Preorder traversal: ");
        if (count == 0) System.out.println("(empty)");
        else {
            preorder(tree, 0);
            System.out.println();
        }
    }
}

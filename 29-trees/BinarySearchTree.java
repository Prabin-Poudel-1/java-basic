import java.util.Scanner;

public class BinarySearchTree {
    private static class Node {
        private final int value;
        private Node left;
        private Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    private static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    private static void inOrder(Node root, StringBuilder output) {
        if (root != null) {
            inOrder(root.left, output);
            if (output.length() > 0) {
                output.append(' ');
            }
            output.append(root.value);
            inOrder(root.right, output);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of values (0 to 100): ");
        if (!input.hasNextLine()) {
            System.out.println("A count is required.");
            return;
        }
        int count;
        try {
            count = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException error) {
            System.out.println("Enter a whole number from 0 to 100.");
            return;
        }
        if (count < 0 || count > 100) {
            System.out.println("Enter a whole number from 0 to 100.");
            return;
        }

        Node root = null;
        for (int i = 0; i < count; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            if (!input.hasNextLine()) {
                System.out.println("Tree input ended early.");
                return;
            }
            try {
                root = insert(root, Integer.parseInt(input.nextLine().trim()));
            } catch (NumberFormatException error) {
                System.out.println("Enter a whole number for every value.");
                return;
            }
        }
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }
        StringBuilder sorted = new StringBuilder();
        inOrder(root, sorted);
        System.out.println("BST values in order: " + sorted);
    }
}

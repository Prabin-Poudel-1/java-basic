import java.util.Scanner;

public class SearchBst {
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

    private static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.value == target) {
            return true;
        }
        return target < root.value ? search(root.left, target) : search(root.right, target);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of BST values (0 to 100): ");
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
        System.out.print("Value to search: ");
        if (!input.hasNextLine()) {
            System.out.println("A search value is required.");
            return;
        }
        int target;
        try {
            target = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException error) {
            System.out.println("Enter a whole number to search.");
            return;
        }
        System.out.println(search(root, target) ? "Value found in the BST." : "Value not found in the BST.");
    }
}

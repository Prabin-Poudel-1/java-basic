import java.util.Scanner;

public class DeleteFromBst {
    private static class Node {
        private int value;
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

    private static boolean contains(Node root, int value) {
        if (root == null || root.value == value) {
            return root != null;
        }
        return value < root.value ? contains(root.left, value) : contains(root.right, value);
    }

    private static Node minimum(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    private static Node delete(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.value) {
            root.left = delete(root.left, value);
        } else if (value > root.value) {
            root.right = delete(root.right, value);
        } else if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        } else {
            Node successor = minimum(root.right);
            root.value = successor.value;
            root.right = delete(root.right, successor.value);
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
        System.out.print("Value to delete: ");
        if (!input.hasNextLine()) {
            System.out.println("A target value is required.");
            return;
        }
        int target;
        try {
            target = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException error) {
            System.out.println("Enter a whole number to delete.");
            return;
        }
        boolean found = contains(root, target);
        root = delete(root, target);
        System.out.println(found ? "Deleted " + target + " from the BST."
                : "Value not found; the BST was unchanged.");
        StringBuilder sorted = new StringBuilder();
        inOrder(root, sorted);
        System.out.println(sorted.length() == 0 ? "BST is empty." : "BST values in order: " + sorted);
    }
}

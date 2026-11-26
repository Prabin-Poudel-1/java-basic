import java.util.Scanner;

public class InorderTraversal {
    private static void traverse(int[] tree, int index, StringBuilder output) {
        if (index >= tree.length) {
            return;
        }
        traverse(tree, index * 2 + 1, output);
        if (output.length() > 0) {
            output.append(' ');
        }
        output.append(tree[index]);
        traverse(tree, index * 2 + 2, output);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of nodes (0 to 100): ");
        if (!input.hasNextLine()) {
            System.out.println("A node count is required.");
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

        int[] tree = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Node value " + (i + 1) + ": ");
            if (!input.hasNextLine()) {
                System.out.println("Tree input ended early.");
                return;
            }
            try {
                tree[i] = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException error) {
                System.out.println("Enter a whole number for every node.");
                return;
            }
        }
        if (count == 0) {
            System.out.println("The tree is empty.");
            return;
        }
        StringBuilder order = new StringBuilder();
        traverse(tree, 0, order);
        System.out.println("In-order traversal: " + order);
    }
}

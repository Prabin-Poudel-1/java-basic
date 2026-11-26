import java.util.Scanner;

public class BinaryTreeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of tree nodes (0 to 100): ");
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

        System.out.println("Complete binary tree (array representation):");
        for (int i = 0; i < count; i++) {
            System.out.print("Node " + tree[i] + ": left ");
            System.out.print(i * 2 + 1 < count ? tree[i * 2 + 1] : "none");
            System.out.print(", right ");
            System.out.println(i * 2 + 2 < count ? tree[i * 2 + 2] : "none");
        }
    }
}

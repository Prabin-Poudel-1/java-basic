import java.util.Scanner;

public class BookInformation {
    private static class Book {
        String title;
        String author;
        String isbn;
        int pages;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book = new Book();

        System.out.print("Enter book title: ");
        if (!input.hasNextLine()) {
            System.out.println("Title, author, and ISBN are required.");
            return;
        }
        book.title = input.nextLine().trim();
        System.out.print("Enter author: ");
        if (!input.hasNextLine()) {
            System.out.println("Title, author, and ISBN are required.");
            return;
        }
        book.author = input.nextLine().trim();
        System.out.print("Enter ISBN: ");
        if (!input.hasNextLine()) {
            System.out.println("Title, author, and ISBN are required.");
            return;
        }
        book.isbn = input.nextLine().trim();
        if (book.title.isEmpty() || book.author.isEmpty() || book.isbn.isEmpty()) {
            System.out.println("Title, author, and ISBN are required.");
            return;
        }

        System.out.print("Enter page count: ");
        if (!input.hasNextInt()) {
            System.out.println("Page count must be a positive whole number.");
            return;
        }
        book.pages = input.nextInt();
        if (book.pages < 1 || input.hasNext()) {
            System.out.println("Page count must be a positive whole number.");
            return;
        }

        System.out.println("Book information:");
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("ISBN: " + book.isbn);
        System.out.println("Pages: " + book.pages);
    }
}

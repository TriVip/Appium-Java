package labs.optional;

import java.util.HashMap;
import java.util.Scanner;

public class BookManagement {
    private HashMap<String, Book> books = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.print("Please input ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Please input title: ");
        String title = scanner.nextLine();
        System.out.print("Please input author: ");
        String author = scanner.nextLine();
        System.out.print("Please input year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Book book = new Book(ISBN, title, author, year);
        books.put(ISBN, book);
        System.out.println("The book is saved into DB with info: " + book);
    }

    public void findBook() {
        System.out.print("Please input ISBN: ");
        String ISBN = scanner.nextLine();
        Book book = books.get(ISBN);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book with ISBN " + ISBN + " is not found");
        }
    }

    public void updateBook() {
        System.out.print("Please input ISBN: ");
        String ISBN = scanner.nextLine();

        if (!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " is not found");
            return;
        }

        System.out.print("Please input new title: ");
        String title = scanner.nextLine();
        System.out.print("Please input new author name: ");
        String author = scanner.nextLine();
        System.out.print("Please input new year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Book book = books.get(ISBN);
        book.setTitle(title);
        book.setAuthor(author);
        book.setYear(year);
        System.out.println("The book is now updated with new content: " + book);
    }

    public void deleteBook() {
        System.out.print("Please input ISBN: ");
        String ISBN = scanner.nextLine();

        if (books.remove(ISBN) != null) {
            System.out.println("Book with ISBN " + ISBN + " is deleted");
        } else {
            System.out.println("Book with ISBN " + ISBN + " is not found");
        }
    }

    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found");
            return;
        }
        books.values().forEach(System.out::println);
    }
}

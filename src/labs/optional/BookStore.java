package labs.optional;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        BookManagement manager = new BookManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n======= Book Management Program (CRUD) ============");
            System.out.println("1. New book");
            System.out.println("2. Find a book (ISBN)");
            System.out.println("3. Update a book");
            System.out.println("4. Delete a book");
            System.out.println("5. Print the book list");
            System.out.println("0. Exit");
            System.out.print("Please choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    manager.addBook();
                    break;
                case 2:
                    manager.findBook();
                    break;
                case 3:
                    manager.updateBook();
                    break;
                case 4:
                    manager.deleteBook();
                    break;
                case 5:
                    manager.printBooks();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
    }
}

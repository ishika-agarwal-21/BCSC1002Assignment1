/*  Created by IntelliJ IDEA.
 *  User: Ishika Agarwal (ishika-agarwal-21)
 *  Date: 29/08/20
 *  Time: 2:47 AM
 *  File Name : FrontDesk.java
 * */
package execution;
import definitions.Student;
import definitions.Book;
import definitions.Library;
import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_NEW_BOOK= 1;
    private static final int RETURN_ISSUED_BOOK= 2;
    private static final int ISSUED_BOOK= 3;
    private static final int EXIT= 4;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int studentInput;
        Book myBookStore= new Book();
        String bookName;
        String bookAuthorName;
        String bookIsbnNumber;

        do{
            System.out.println("\"Welcome To The Front Desk\"");
            System.out.println("==========");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1...4)");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("enter book that you want to issue:");
                    scanner.nextLine();
                    bookName= scanner.nextLine();
                    myBookStore.issuedBookName(bookName);
                    break;
                case RETURN_ISSUED_BOOK:
                    System.out.println("Return the book you have issued earlier!");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myBookStore.doReturn(bookName);
                    break;
                case ISSUED_BOOK:
                    System.out.println("enter the books which are issued");
                    scanner.nextLine();
                    bookName= scanner.nextLine();
                    myBookStore.issuedBooks(bookName);
                    break;
            }
        } while (studentInput!= EXIT);
        scanner.close();

    }
}

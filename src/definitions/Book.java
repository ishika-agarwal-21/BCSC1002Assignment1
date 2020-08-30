/*  Created by IntelliJ IDEA.
 *  User: Ishika Agarwal (ishika-agarwal-21)
 *  Date: 28/08/20
 *  Time: 5:18 PM
 *  File Name : Book.java
 * */
package definitions;
import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String bookIsbnNumber;

    // Constructor Method
    public Book() {
        this.bookName= "BHAGAVAD GITA AS IT IS";
        this.bookAuthorName= "A C Swami";
        this.bookIsbnNumber= "9780025105508";
    }
    public Book(String bookName, String bookAuthorName, String bookIsbnNumber){
        this.bookName= bookName;
        this.bookAuthorName= "A C Swami";
        this.bookIsbnNumber= "9780025105508";
    }
    public Book(String bookName, String bookAuthorName, long l) {

    }

    public void issuedBookName() {
        System.out.println("Thank you for issuing \"" + getBookName() + "\".");
    }

    public void doReturn() {
        System.out.println("Thank you for returning \"" + getBookName() + "\".");
    }

    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName= bookName;
    }
    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookIsbnNumber() {
        return bookIsbnNumber;
    }

    public void setBookIsbnNumber(String bookIsbnNumber) {
        this.bookIsbnNumber = bookIsbnNumber;
    }
    // The toString Method

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", bookIsbnNumber='" + bookIsbnNumber + '\'' +
                '}';
    }
    // The equals() Method

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if(o== null || getClass() != o.getClass()){
            return false;
        }
        Book book = (Book) o;
        return getBookAuthorName() == book.getBookAuthorName() &&
                bookIsbnNumber() == book.getBookIsbnNumber() &&
                Objects.equals(getBookName(),book.getBookName());
    }
    private String bookIsbnNumber(){
        return bookIsbnNumber;
    }
    // The HashCode method()


    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthorName(), getBookIsbnNumber());
    }
    public void issuedBookName(String bookName) {
    }

    public void doReturn(String bookName) {
    }

    public void issuedBooks(String bookName) {
    }

}

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
}

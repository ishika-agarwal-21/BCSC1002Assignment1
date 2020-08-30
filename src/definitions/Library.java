/*  Created by IntelliJ IDEA.
 *  User: Ishika Agarwal (ishika-agarwal-21)
 *  Date: 28/08/20
 *  Time: 8:56 PM
 *  File Name : Library.java
 * */
package definitions;
import java.util.Arrays;

public class Library {
    private Book[] store;

    public Library(){
        this.store = new Book[50];
        for(int i=0; i< store.length; i++){
            store[i] =  new Book("Book" + (i+1), null, "9780025105508L" + (i+1));
        }
    }
    public Library(Book[] store){
        this.store= store;
    }
    public Book[] getStore() {
        return store.clone();
    }
    public void setStore(Book[] store){
        this.store = store;
    }
// annotation
    @Override
    public String toString() {
        return Arrays.toString(store);
    }
//annotation

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null ||  getClass() != o.getClass()){
            return false;
        }
        Library that = (Library) o;
        return Arrays.equals(getStore(), that.getStore());
    }
// annotation

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }
}

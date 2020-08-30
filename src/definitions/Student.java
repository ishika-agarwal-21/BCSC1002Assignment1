/*  Created by IntelliJ IDEA.
 *  User: Ishika Agarwal (ishika-agarwal-21)
 *  Date: 28/08/20
 *  Time: 10:03 PM
 *  File Name : Student.java
 * */
package definitions;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
// FIELDS
    String studentFirstName;
    String studentMiddleName;
    String studentLastName;
    long studentUniRollNo;
    int noOfBookIssued;
    Book[] Issued;
    Scanner scanner= new Scanner(System.in);
// CONSTRUCTOR METHOD

    public Student() {
        this.studentFirstName= "AJAY";
        this.studentMiddleName= "KUMAR";
        this.studentLastName= "AGARWAL";
        this.studentUniRollNo= 191500357;
        this.noOfBookIssued= 0;
        this.Issued= new Book[5];
    }
    public Student( String studentFirstName, String studentMiddleName, String studentLastName, long studentUniRollNo,int noOfBookIssued, Book[] Issued){
        this.studentFirstName= studentFirstName;
        this.studentMiddleName= studentMiddleName;
        this.studentLastName= studentLastName;
        this.studentUniRollNo= studentUniRollNo;
        this.noOfBookIssued= noOfBookIssued;
        this.Issued= Issued;
    }
    public  Student(String studentFirstName) {
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = "KUMAR";
        this.studentLastName = "AGARWAL";
        this.studentUniRollNo = 191500357;
        this.noOfBookIssued = 0;
        this.Issued = Issued;
    }
    public String getStudentFirstName(){
        return studentFirstName;
    }
    public void setStudentFirstName(String studentFirstName){
        this.studentFirstName= studentFirstName;
    }
    public String getStudentMiddleName(){
        return studentMiddleName;
    }
    public void setStudentMiddleName(String studentMiddleName){
        this.studentMiddleName= studentMiddleName;
    }
    public String getStudentLastName(){
        return studentLastName;
    }
    public void setStudentLastName(String studentLastName){
        this.studentLastName= studentLastName;
    }
    public long getStudentUniRollNo(){
        return studentUniRollNo;
    }
    public void setStudentUniRollNo(long studentUniRollNo){
        this.studentUniRollNo= studentUniRollNo;
    }
    public int getNoOfBookIssued(){
        return noOfBookIssued;
    }
    public void setNoOfBookIssued(int noOfBookIssued){
        this.noOfBookIssued= noOfBookIssued;
    }
    public void doIssue(){
        if (noOfBookIssued==0){
            System.out.println("please enter your first name");
            studentFirstName= scanner.nextLine();
            System.out.println("please enter your middle name");
            studentMiddleName= scanner.nextLine();
            System.out.println("please enter your last name");
            studentLastName= scanner.nextLine();
            System.out.println("please enter your uni roll number name");
            studentUniRollNo= scanner.nextInt();
        }
        System.out.println("enter name of the book");
        String bookName= scanner.nextLine();
        System.out.println("enter name of the author");
        String bookAuthorName = scanner.nextLine();
        System.out.println(" enter ISBN number of the book");
        long bookIsbnNumber= scanner.nextLong();
        Issued[getNoOfBookIssued()]= new Book(bookName, bookAuthorName, bookIsbnNumber);
        System.out.println(bookName + " " + "book issued!");
        System.out.println("--Welcome to front Desk");
    }
// this method is used to return a book.

    public void doReturn(){
        if (noOfBookIssued == 0){
            System.out.println("NO BOO IS RETURNED");
        } else{
          noOfBookIssued=0;
          this.Issued= new Book[10];
            System.out.println("Books are returned!");
        }
    }
    public void showIssuedBooks(){
        System.out.println("StudentFirstName: " + studentFirstName);
        System.out.println("StudentMiddleName: " + studentMiddleName);
        System.out.println("StudentLastName: " + studentLastName);
        System.out.println("studentUniRollNumber: " + studentUniRollNo);
        for (int i=0; i< noOfBookIssued; i++){
            System.out.println("Issued= " + Issued[i]);
        }
        if(noOfBookIssued==0){
            System.out.println("no book issued!");
        }
    }

    @Override
    public String toString() {
        return "StudentFirstName: " + getStudentFirstName() + ", " +
                "StudentMiddleName: " + getStudentMiddleName() + ", " +
                "StudentLastName: " + getStudentLastName() + ", " +
                "Student University Roll Number: " + getStudentUniRollNo() +
                "Number of Books Issued: " + getNoOfBookIssued() + ", " +
                "Name Of The Books Issued: " + getIssued() + ".";
    }
    private Object[] getIssued(){
        return new Object[0];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student that = (Student) o;
        return Arrays.equals(getIssued(), that.Issued);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getIssued());
    }
}




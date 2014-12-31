
import java.util.EnumSet;
/*
 * List of books via enum
 * From "Java How To Program, 10/e, Early Objects" - Chapter 8.
 */

public class Books {
    
    public enum Book {
        //Constants
        JHTP("Java How to Program", "2015"),
        CHTP("C How to Program", "2013"),
        IW3HTP("Internet & World Wide Web How to Program", "2012"),
        CPPHTP("C++ How to Program", "2014"),
        VBHTP("Visual Basic How to Program", "2014"),
        CHSARPHTP("Visual C# how to Program", "2014");
        
        //Fields
        private final String title;
        private final String year;
        
        //Constructor
        Book(String nTitle, String nYear) {
            this.title = nTitle;
            this.year = nYear;
        } //End Constructor
        
        //Getters
        public String getTitle() {
            return title;
        } //End getTitle
        
        public String getYear() {
            return year;
        } //End getYear
        
    } //End Book

    
    //Test for Books
    public static void main(String[] args) {
        //All books
        System.out.println("All books:");
        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), 
                    book.getYear());
        }
        
        //First four books
        System.out.println("First four books:");
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)) {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), 
                    book.getYear());
        }
        
        System.out.println("Single book");
        System.out.printf("%-10s%-45s%s%n", Book.JHTP, Book.JHTP.getTitle(), 
                    Book.JHTP.getYear());
    } //End main
    
} //End Books


import java.util.EnumSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Books {
    
    public enum Book {
        //Constants
        JHTP("Java How to Program", "2015"),
        CHTP("C How to Program", "2013"),
        IW3HTP("Internet & World Wide Web How to Program", "2012"),
        CPPHTP("C++ How to Program","2014"),
        VBHTP("Visual Basic How to Program","2014"),
        CHSARPHTP("Visual C# how to Program","2014");
        
        //Fields
        private final String title;
        private final String year;
        
        //Constructor
        Book(String nTitle, String nYear) {
            this.title = nTitle;
            this.year = nYear;
        }
        
        //Getters
        public String getTitle() {
            return title;
        }
        
        public String getYear() {
            return year;
        }
        
    }//End Book

    
    //Test for Books
    public static void main(String[] args) {
        //All books
        System.out.println("All books:");
        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n",book, book.getTitle(), book.getYear());
        }
        
        //First four books
        System.out.println("First four books");
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)) {
            System.out.printf("%-10s%-45s%s%n",book, book.getTitle(), book.getYear());
        }
    }
    
}

package OOPs.LMSv2;
import java.util.ArrayList;
//Library Management System Version-2
public class Library {
    private ArrayList<Book> books=new ArrayList<>();
    public void addBook(Book book){
        this.books.add(book);
    }
    public void removeBook(Book book){
        this.books.remove(book);
    }
    public void displayBooks(){
        for(Book book : books){
            System.out.print(book.getTitle() + " ");
        }
        System.out.println();
    }
    public void displayAvailableBooks(){
        for(Book book : books){
            if(book.getAvailability()){
                System.out.print(book.getTitle() + " ");
            }
        }
    }
    public boolean isAvailable(String str){
        for(Book book : books){
            if(book.getTitle().equals(str)){
                if(book.getAvailability()){
                    return true;
                }
            }
        }
        return false;
    }
    public Book getBook(String str){
        for(Book book : books){
            if(book.getTitle().equals(str)){
                return book;
            }
        }
        return null;
    }
    public void setAvailibilityFalse(String str){
        getBook(str).setAvailabilityFalse();
    }

}
class Book{
    private String title;
    private boolean availability;

    Book(String title){
        this.title=title;
        availability=true;
    }
    public String getTitle(){
        return title;
    }
    public boolean getAvailability(){
        return availability;
    }
    public void setAvailabilityFalse(){
        availability=false;
    }
}
class Librarian{
    Library library;
    Librarian(Library library){
        this.library=library;
    }
    public void addBook(Book book){
        library.addBook(book);
    }
}
class Student{
    private Library library;
    private ArrayList<Book> borrowed=new ArrayList<>();
    Student(Library library){
        this.library=library;
    }
    public void borrowBook(String str){
        if(library.isAvailable(str)){
            borrowed.add(library.getBook(str));
            library.setAvailibilityFalse(str);
        }
    }
    public void displayBorrowedBooks() {
        for (Book book : borrowed) {
            System.out.println(book.getTitle());
        }
    }
}
class Main{
    public static void main(String[] args){
        Library library=new Library();

        Book pythonBook=new Book("Python");
        Book oopsBook=new Book("OOPs");
        Book maths=new Book("Mathematics");
        library.addBook(oopsBook);
        library.addBook(pythonBook);
        library.displayBooks();
        Librarian librarian=new Librarian(library);
        librarian.addBook(maths);
        library.displayBooks();
        Student stu=new Student(library);
        stu.borrowBook("Mathematics");
        stu.displayBorrowedBooks();
        library.displayBooks();
        library.displayAvailableBooks();
    }
}

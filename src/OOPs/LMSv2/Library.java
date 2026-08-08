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
            System.out.print(book.getTitle());
            if(isAvailable(book.getTitle())){
                System.out.print("(Available) ");
            }else{
                System.out.print("(Unavailable) ");
            }
        }
        System.out.println();
    }
    public void displayAvailableBooks(){
        for(Book book : books){
            if(book.getAvailability()){
                System.out.print(book.getTitle() + " ");
            }
        }
        System.out.println();
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
    public void setAvailibilityTrue(String str){
        getBook(str).setAvailabilityTrue();
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
    public void setAvailabilityTrue(){
        availability=true;
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
class User{
    private int id;
    private String userName;
    public Library library;
    private ArrayList<Book> borrowed=new ArrayList<>();
    User(int id, String userName, Library library){
        this.id=id;
        this.userName=userName;
        this.library=library;
    }
    public void borrowBook(String str){
        if(library.isAvailable(str)){
            System.out.println(this.userName + " just borrowed " + str);
            borrowed.add(library.getBook(str));
            library.setAvailibilityFalse(str);
        }else {
            System.out.println("Book not available.");
        }
    }
    public void returnBook(String str){
        library.setAvailibilityTrue(str);
    }
    public void displayBorrowedBooks() {
        System.out.print(this.userName + " has borrowed: ");
        for (Book book : borrowed) {
            System.out.print(book.getTitle() + " ");
        }
        System.out.println();
    }
}
class Student extends User{
    Student(int id, String userName, Library library) {
        super(id, userName, library);
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
        Student suresh=new Student(1, "Suresh", library);
        suresh.borrowBook("Mathematics");
        suresh.displayBorrowedBooks();
        library.displayBooks();
        Student mahesh=new Student(2, "Mahesh", library);
        mahesh.borrowBook("Python");
        library.displayBooks();
        mahesh.displayBorrowedBooks();
        mahesh.returnBook("Python");
        library.displayBooks();
        suresh.borrowBook("OOPs");
        suresh.displayBorrowedBooks();
    }
}

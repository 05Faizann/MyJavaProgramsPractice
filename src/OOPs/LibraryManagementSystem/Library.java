package OOPs.LibraryManagementSystem;
import java.util.ArrayList;

public class Library {
    static ArrayList<String> Books=new ArrayList<>();
    static ArrayList<Boolean> Avail=new ArrayList<>();
    public void addBooks(String Book){};
    public void displayBooks(){};
    public void borrowBook(String str){};
    public void returnBook(String str){};
}
class Librarian extends Library{
    public void addBooks(String Book){
        Books.add(Book);
        Avail.add(true);
    }
}
class Student extends Library{
    public void displayBooks(){
        for(int i=0; i<Books.size(); i++){
            if(Avail.get(i)){
                System.out.print(Books.get(i));
                if(i<Books.size()-1){
                    System.out.print(", ");
                }
                if(i==Books.size()-1){
                    System.out.print(".");
                }
            }
        }
        System.out.println();
//        System.out.println(Books);
    }
    public void borrowBook(String str){
        boolean flag=false;
        for(int i=0; i<Books.size(); i++){
            if(str.equals(Books.get(i))){
                if(Avail.get(i)){
                    System.out.println("Book borrowed: " + Books.get(i));
                    Avail.set(i, false);
                }else{
                    System.out.println("Not available at the moment.");
                }
                flag=true;
            }
        }if(!flag){
            System.out.println("Book not in library.");
        }
    }
    public void returnBook(String str){
        boolean flag=false;
        for(int i=0; i<Books.size(); i++){
            if (str.equals(Books.get(i))){
                Avail.set(i, true);
                System.out.println("Book returned.");
                flag=true;
            }
        }if(!flag){
            System.out.println("No such book in record.");
        }
    }

}
class Main{
    public static void main(String[] args){
        Library obj=new Librarian();
        obj.addBooks("Malay Tiger");
        obj.addBooks("percy Jackson");
        obj.addBooks("Yale Overdue");

        Library stu=new Student();
        stu.displayBooks();
        stu.borrowBook("Malay Tigers");
        stu.borrowBook("Malay Tiger");
        stu.displayBooks();
        stu.borrowBook("Malay Tiger");
        stu.returnBook("Malay Tiger");
        stu.borrowBook("Malay Tiger");
        stu.returnBook("Detective");
    }
}

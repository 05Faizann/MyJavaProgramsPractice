public class Student {
    int id;
    String name;
    int age;
    double marks;

    Student(int id, String name, int age, double marks){
        this.id=id;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public void displayDetails(){
        System.out.println("ID of the Student: "+id);
        System.out.println("Name of the Student: "+name);
        System.out.println("Age of the Student: "+ age);
        System.out.println("Marks of the student: "+marks);
        System.out.println("Is Pass?: "+ isPass()+ "\n");
    }
    public boolean isPass(){
        return marks >= 40.0;
    }
    public void updateMarks(double marks){
        this.marks=marks;
    }

    public static void main(String[] args){
        Student stu1=new Student(1, "Ray", 24, 87.90);
        Student stu2=new Student(2, "John", 23, 75.67);
        Student stu3=new Student(3, "Mathews", 21,37.50);

        stu1.displayDetails();

        stu2.displayDetails();

        stu3.displayDetails();

        stu1.updateMarks(34.48);
        stu1.displayDetails();
    }
}

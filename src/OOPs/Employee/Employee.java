package OOPs.Employee;

public class Employee {
    final protected int id;
    final protected String name;
    protected double baseSalary;

    Employee(int id, String name, double baseSalary){
        this.id=id;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public double calculateSalary(){
        return baseSalary;
    }
}
class Manager extends Employee{
    protected double bonus;
    Manager(int id, String name, double baseSalary, double bonus){
        super(id, name, baseSalary);
        this.bonus=bonus;
    }
    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }
}
class Developer extends Employee{
    int overtimeHours;
    Developer(int id, String name, double baseSalary, int overtimeHours){
        super(id, name, baseSalary);
        this.overtimeHours=overtimeHours;
    }
    @Override
    public double calculateSalary(){
        return baseSalary + overtimeHours*500;
    }
}
class Main {
    public static void main(String[] args) {
        Employee[] employees = {new Manager(1, "Manan", 50000, 30000),
                new Developer(2, "kanak", 30000, 6),
                new Developer(3, "Raj", 40000, 4)};

        for(Employee e : employees){
            System.out.println(e.calculateSalary());
        }
    }
}
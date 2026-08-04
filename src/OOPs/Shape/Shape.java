package OOPs.Shape;

public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
class Square extends Shape{
    double side;
    Square(double side){
        this.side=side;
    }
    @Override
    public double area(){
        return Math.pow(side, 2);
    }
    @Override
    public double perimeter(){
        return 4*side;
    }
}
class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double area(){
        return length*breadth;
    }
    @Override
    public double perimeter(){
        return 2*(length+breadth);
    }
}
class Main{
    public static void main(String[] args){
        Shape[] s={new Circle(10.0),
        new Square(10.0),
        new Rectangle(10, 20)};

        for(Shape x : s){
            System.out.println(x.area());
            System.out.println(x.perimeter() + "\n");
        }
    }
}

abstract class Shape {
    abstract double area();
    
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    
    double area() {
        return 3.14 * radius * radius;
    }
}

public class Ashape {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        s.display();
        System.out.println("Area: " + s.area());
    }
}
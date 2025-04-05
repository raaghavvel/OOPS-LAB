public class AreaCalculator {
    int area(int side) {
        return side * side;
    }
    
    int area(int length, int width) {
        return length * width;
    }
    
    double area(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        
        System.out.println("Area of Square (side=5): " + ac.area(5));
        System.out.println("Area of Rectangle (4x6): " + ac.area(4, 6));
        System.out.println("Area of Circle (radius=3.5): " + ac.area(3.5));
    }
}
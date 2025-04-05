class Rectangle {
    int length, width;

    Rectangle() {
        length = 0;
        width = 0;
    }
    

    Rectangle(int side) {
        length = side;
        width = side;
    }
    
 
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    
    int area() {
        return length * width;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();       
        Rectangle r2 = new Rectangle(5);      
        Rectangle r3 = new Rectangle(4, 6);  
        
        System.out.println("Area 1: " + r1.area());
        System.out.println("Area 2: " + r2.area());
        System.out.println("Area 3: " + r3.area());
    }
}
class Calculator {
    Calculator() {
        System.out.println("Calculator initialized");
    }

    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(5, 3));    
        System.out.println(calc.add(4.2, 3.8)); 
        System.out.println(calc.add(1, 2, 3));   
    }
}
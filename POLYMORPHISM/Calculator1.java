class Calculation {
    int add(int a, int b) {
        return a + b;
    }
}

class AdvancedCalc extends Calculator {
    int add(int a, int b) {  // Overriding add()
        System.out.println("Adding two numbers:");
        return a + b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        AdvancedCalc c = new AdvancedCalc();
        System.out.println(c.add(5, 3));
    }
}
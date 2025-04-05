interface Calculator {
    default void show() {
        System.out.println("Default Calculator");
    }
    int add(int a, int b);
}

class BasicCalc implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Icalculator {
    public static void main(String[] args) {
        BasicCalc c = new BasicCalc();
        System.out.println("Sum: " + c.add(5, 3));
        c.show();
    }
}
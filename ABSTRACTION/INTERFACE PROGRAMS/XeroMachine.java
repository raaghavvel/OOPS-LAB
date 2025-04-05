interface Printer {
    default void print() {
        System.out.println("Printing document");
    }
}

interface Scanner {
    default void scan() {
        System.out.println("Scanning document");
    }
}

class AllInOneMachine implements Printer, Scanner {
}

public class XeroMachine {
    public static void main(String[] args) {
        AllInOneMachine machine = new AllInOneMachine();
        machine.print();
        machine.scan();
    }
}
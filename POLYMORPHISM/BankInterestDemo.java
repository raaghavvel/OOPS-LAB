class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {

    double getInterestRate() {
        return 7.5;
    }
}

class HDFC extends Bank {

    double getInterestRate() {
        return 8.0;
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 8.5;
    }
}

public class BankInterestDemo {
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        Bank bank2 = new HDFC();
        Bank bank3 = new ICICI();

        System.out.println("SBI Interest Rate: " + bank1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + bank2.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + bank3.getInterestRate() + "%");
    }
}
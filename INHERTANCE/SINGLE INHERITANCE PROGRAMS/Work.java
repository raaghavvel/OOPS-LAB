class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: $" + bonus);
    }
}

public class Work {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 60000, 5000);
        mgr.displayDetails();
    }
}

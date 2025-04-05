class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class Mwork {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 35, 75000, "HR");
        mgr.displayDetails();
    }
}

abstract class Employee {
    protected String name;
    protected int id;
    
   
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
   
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    
   
    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;
    
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    
   
    public double calculateSalary() {
        return monthlySalary;
    }
}

public class Work {
    public static void main(String[] args) {
        Employee emp = new FullTimeEmployee("John Doe", 101, 5000);
        emp.displayInfo();
        System.out.println("Monthly Salary: $" + emp.calculateSalary());
    }
}
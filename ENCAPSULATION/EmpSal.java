class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }


    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name provided");
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("Age must be between 18-65");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }

    public void setDepartment(String department) {
        if (department != null && !department.isEmpty()) {
            this.department = department;
        } else {
            System.out.println("Department cannot be empty");
        }
    }

   
    public void giveRaise(double percentage) {
        if (percentage > 0 && percentage <= 20) {
            this.salary += this.salary * (percentage / 100);
            System.out.println("Raise applied. New salary: " + this.salary);
        } else {
            System.out.println("Raise percentage must be between 0-20%");
        }
    }
}

public class EmpSal {
    public static void main(String[] args) {
        // Create employee object
        Employee emp = new Employee("John Doe", 30, 50000.0, "Engineering");
        
        // Access data through getters
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Current Salary: $" + emp.getSalary());
        
        // Modify data through setters
        emp.setName("garr");
        emp.setAge(67);  
        emp.setSalary(-1000);  
        
        // Give raise through business method
        emp.giveRaise(10); 
        emp.giveRaise(25); 
        
        // Print updated information
        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: $" + emp.getSalary());
    }
}
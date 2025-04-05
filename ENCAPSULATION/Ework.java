class Employee {
    private String empName;
    private int empID;
    
    public String getEmpName() {
    return empName;
    }
    
    public void setEmpName(String empName) {
    this.empName = empName;
    }
    
    public int getEmpID() {
    return empID;
    }
    
    public void setEmpID(int empID) {
    if (empID > 0) {
    this.empID = empID;
    } else {
    System.out.println("Invalid employee ID!");
    }
    }
    }
    
    public class Ework {
    public static void main(String[] args) {
    Employee e = new Employee();
    e.setEmpName("Nina");
    e.setEmpID(1022);
    System.out.println("Employee Name: " + e.getEmpName());
    System.out.println("Employee ID: " + e.getEmpID());
    }
    }
    
abstract class ElectronicDevice {
    private String brand;
    private double price;
    private int warrantyYears;
    
  
    public ElectronicDevice(String brand, double price, int warrantyYears) {
        this.brand = brand;
        this.price = price;
        this.warrantyYears = warrantyYears;
        System.out.println("ElectronicDevice constructor called");
    }
    

    public String getBrand() {
        return brand;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void displayBasicInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warrantyYears + " years");
    }
    
    
    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void performDiagnostics();
}

class SmartTV extends ElectronicDevice {
    private int screenSize;
    private String resolution;
    

    public SmartTV(String brand, double price, int warranty, 
                  int screenSize, String resolution) {
        super(brand, price, warranty);  // Calling parent constructor
        this.screenSize = screenSize;
        this.resolution = resolution;
        System.out.println("SmartTV constructor called");
    }
    
    
    public void powerOn() {
        System.out.println("SmartTV is booting up");
        System.out.println("Showing " + "brand" + " logo");
    }
    
    
    public void powerOff() {
        System.out.println("SmartTV is shutting down");
    }
    
  
    public void performDiagnostics() {
        System.out.println("Running TV diagnostics:");
        System.out.println("- Checking HDMI ports");
        System.out.println("- Testing display pixels");
    }
    
  
    public void displayTechSpecs() {
        displayBasicInfo();  // Using inherited method
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Resolution: " + resolution);
    }
}

public class Device {
    public static void main(String[] args) {
        SmartTV myTV = new SmartTV("Samsung", 899.99, 2, 55, "4K UHD");
        
        System.out.println("\n=== Device Information ===");
        myTV.displayTechSpecs();
        
        System.out.println("\n=== Power Operations ===");
        myTV.powerOn();
        myTV.powerOff();
        
        System.out.println("\n=== Maintenance ===");
        myTV.performDiagnostics();
    }
}
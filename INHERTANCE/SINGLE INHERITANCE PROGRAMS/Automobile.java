class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Automobile {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 180, "Petrol");
        myCar.displayInfo();
    }
}

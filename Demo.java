package bha;

//Interface with common behavior and accessors for shared data

interface Vehicle {
    String getVehicleNumber();
    String getFuelType();

    default void displayDetails() {
        System.out.println("Vehicle Number: " + getVehicleNumber() +
                           ", Fuel Type: " + getFuelType());
    }
}

class Car implements Vehicle {
    private final String number, fuel;

    public Car(String number, String fuel) {
        this.number = number;
        this.fuel = fuel;
    }

   public String getVehicleNumber() { return number; }
    public String getFuelType() { return fuel; }
}

class Bike implements Vehicle {
    private final String number, fuel;

    public Bike(String number, String fuel) {
        this.number = number;
        this.fuel = fuel;
    }

    public String getVehicleNumber() { return number; }
    public String getFuelType() { return fuel; }
}

public class Demo {
    public static void main(String[] args) {
        Vehicle car = new Car("KA01AB1234", "Petrol");
        Vehicle bike = new Bike("KA02XY5678", "Electric");

        car.displayDetails();
        bike.displayDetails();
    }
}

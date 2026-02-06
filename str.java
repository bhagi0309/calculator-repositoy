package bha;

import java.util.Scanner;


abstract class DeliveryPackage {
    protected int weight;
    protected int distance;

    public DeliveryPackage(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
        
    }

   
    public int calculateBaseFare() {
        return weight * 2;
    }

  
    public abstract int calculateDeliveryCharge();

    public int calculateTotal() {
        return calculateBaseFare() + calculateDeliveryCharge();
    }
}

class BikeDelivery extends DeliveryPackage {
    public BikeDelivery(int weight, int distance) {
        super(weight, distance);
    }

    @Override
    public int calculateDeliveryCharge() {
        if (weight > 500) {
            return 0; // free delivery
        }
        return distance * 10;
    }
}


class CarDelivery extends DeliveryPackage {
    public CarDelivery(int weight, int distance) {
        super(weight, distance);
    }

   
    public int calculateDeliveryCharge() {
        int charge = distance * 20;
        if (distance > 50) {
            charge = charge / 2; 
        return charge;
    }
}

public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String mode = sc.next();
        int weight = sc.nextInt();
        int distance = sc.nextInt();

       
        DeliveryPackage pkg;

        if (mode.equalsIgnoreCase("Bike")) {
            pkg = new BikeDelivery(weight, distance);
        } else if (mode.equalsIgnoreCase("Car")) {
            pkg = new CarDelivery(weight, distance);
        } else {
            System.out.println("Invalid mode. Use 'Bike' or 'Car'.");
            sc.close();
            return;
        }

        int baseFare = pkg.calculateBaseFare();
        int deliveryCharge = pkg.calculateDeliveryCharge();
        int finalAmount = pkg.calculateTotal();

        System.out.println("Base Fare: " + baseFare);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Amount: " + finalAmount);

        sc.close();
    }
}
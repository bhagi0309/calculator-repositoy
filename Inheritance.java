package bha;
import java.util.*;

interface DeliveryCharge {
    int calculateDelivery(int distance);
}

abstract class Package {
    int weight;
    int distance;

    Package(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }

    int calculateBaseFare() {
        return weight * 2;
    }

    abstract int calculateTotal();
}

class BikeDelivery extends Package implements DeliveryCharge {

    BikeDelivery(int weight, int distance) {
        super(weight, distance);
    }

    public int calculateDelivery(int distance) {
        if (weight > 500) {
            return 0; // free delivery
        }
        return distance * 10;
    }

    @Override
    int calculateTotal() {
        int baseFare = calculateBaseFare();
        int deliveryCharge = calculateDelivery(distance);
        return baseFare + deliveryCharge;
    }
}

class CarDelivery extends Package implements DeliveryCharge {

    CarDelivery(int weight, int distance) {
        super(weight, distance);
    }

    public int calculateDelivery(int distance) {
        int charge = distance * 20;

        if (distance > 50) {
            charge = charge / 2; // 50% discount
        }

        return charge;
    }

    @Override
    int calculateTotal() {
        int baseFare = calculateBaseFare();
        int deliveryCharge = calculateDelivery(distance);
        return baseFare + deliveryCharge;
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mode = sc.next();
        int weight = sc.nextInt();
        int distance = sc.nextInt();

        Package pkg;

        if (mode.equalsIgnoreCase("Bike")) {
            pkg = new BikeDelivery(weight, distance);
        } else {
            pkg = new CarDelivery(weight, distance);
        }

        int baseFare = pkg.calculateBaseFare();

        DeliveryCharge dc = (DeliveryCharge) pkg;
        int deliveryCharge = dc.calculateDelivery(distance);

        int finalAmount = pkg.calculateTotal();

        System.out.println("Base Fare: " + baseFare);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Amount: " + finalAmount);
    }
}

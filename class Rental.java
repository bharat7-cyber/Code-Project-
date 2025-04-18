class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    void rent() {
        System.out.println(name + " is rented.");
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    void rent() {
        System.out.println("Car " + name + " is rented for ₹1000/day.");
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle v = new Car("Hyundai i20");
        v.rent();
    }
}

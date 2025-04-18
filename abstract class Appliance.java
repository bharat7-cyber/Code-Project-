abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}

class Fan extends Appliance {
    void turnOn() {
        System.out.println("Fan turned ON");
    }

    void turnOff() {
        System.out.println("Fan turned OFF");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Appliance a = new Fan();
        a.turnOn();
        a.turnOff();
    }
}

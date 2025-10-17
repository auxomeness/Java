class Appliance {
    private String brand;
    private int power;

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }

    public void setBrand(String newValue) {
        brand = newValue;
    }

    public void setPower(int newValue) {
        power = newValue;
    }

    public void turnOn() {
        System.out.println("The appliance is now ON!");
    }

    public void turnOff() {
        System.out.println("The appliance is now OFF!");
    }
}

class WashingMachine extends Appliance {
    private double capacity;

    @Override
    public void turnOn() {
        System.out.println("Washing Machine: turned ON.");
    }

    public void startWash() {
        System.out.println("Washing Machine: Starting wash cycle.");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing Machine: turned OFF.");
    }
}

class Television extends Appliance {
    private double screenSize;

    @Override
    public void turnOn() {
        System.out.println("Television: turned ON.");
    }

    public void changeChannel(int channel) {
        System.out.println("Television: changing Channel(" + channel + ")");
    }

    @Override
    public void turnOff() {
        System.out.println("Television: turned OFF.");
    }
}

class Refrigerator extends Appliance {
    private double temperature;

    @Override
    public void turnOn() {
        System.out.println("Refrigerator: turned ON.");
    }

    public void setTemperature(double temperature) {
        System.out.println("Refrigerator: setting temperature to " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator: turned OFF.");
    }
}

public class Pavia_MyLittlePoly {
    public static void main(String[] args) {
        Appliance appliance;

        appliance = new WashingMachine();
        appliance.turnOn();
        appliance.turnOff();
        System.out.println("");

        appliance = new Television();
        appliance.turnOn();
        appliance.turnOff();
        System.out.println("");

        appliance = new Refrigerator();
        appliance.turnOn();
        appliance.turnOff();
        System.out.println("");
    }
}


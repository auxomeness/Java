class Vehicle {
    private String brand;
    private String model;
    private int year;
    
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setBrand(String newValue) {
        brand = newValue;
    }
    
    public void setModel(String newValue) {
        model = newValue;
    }
    
    public void setYear(int newValue) {
        year = newValue;
    }
    
    public static class Car extends Vehicle {
        private String color;
        private String tires;
        private String engine;
        
        public String getColor() {
            return color;
        }
        
        public String getTires() {
            return tires;
        }
        
        public String getEngine() {
            return engine;
        }
        
        public void setColor(String newValue) {
            color = newValue;
        }
        
        public void setTires(String newValue) {
            tires = newValue;
        }
        
        public void setEngine(String newValue) {
            engine = newValue;
        }
    }
    
    public static class Motorcycle extends Vehicle {
        private int speed;
        private int odo;
        private String build;
        
        public int getSpeed() {
            return speed;
        }
        
        public int getOdo() {
            return odo;
        }
        
        public String getBuild() {
            return build;
        }
        
        public void setSpeed(int newValue) {
            speed = newValue;
        }
        
        public void setOdo(int newValue) {
            odo = newValue;
        }
        
        public void setBuild(String newValue) {
            build = newValue;
        }
    }
    
    public static class DisplayCar extends Car {
        
        public void outputCar() {
            System.out.println("Car Details:");
            System.out.println("Brand: " + getBrand());
            System.out.println("Model: " + getModel());
            System.out.println("Year: " + getYear());
            System.out.println("Color: " + getColor());
            System.out.println("Tires: " + getTires());
            System.out.println("Engine: " + getEngine());
        }
    }
    
    public static class DisplayMotorcycle extends Motorcycle {
        
        public void outputMotorcycle() {
            System.out.println("Motorcycle Details:");
            System.out.println("Brand: " + getBrand());
            System.out.println("Model: " + getModel());
            System.out.println("Year: " + getYear());
            System.out.println("Speed: " + getSpeed());
            System.out.println("Odo: " + getOdo());
            System.out.println("Build: " + getBuild());
        }
    }
    
}

public class Main {
    public static void main(String args[]) {
        
        Vehicle.DisplayCar obj = new Vehicle.DisplayCar();
        obj.setBrand("Lamborghini");
        obj.setModel("Aventador");
        obj.setYear(2023);
        obj.setColor("Red");
        obj.setTires("Tubeless");
        obj.setEngine("V12");
        obj.outputCar();

        System.out.println(" ");
        
        Vehicle.DisplayMotorcycle obj2 = new Vehicle.DisplayMotorcycle();
        obj2.setBrand("Kawasaki");
        obj2.setModel("Ninja");
        obj2.setYear(2024);
        obj2.setSpeed(900);
        obj2.setOdo(15000);
        obj2.setBuild("Tamiya");
        obj2.outputMotorcycle();

        System.out.println(" ");

        Vehicle.DisplayCar obj3 = new Vehicle.DisplayCar();
        obj3.setBrand("Bugatti");
        obj3.setModel("Tourbillon");
        obj3.setYear(2025);
        obj3.setColor("Blue");
        obj3.setTires("Michelin Pilot Cup Sport");
        obj3.setEngine("V16");
        obj3.outputCar();
        
        System.out.println(" ");
        
        Vehicle.DisplayMotorcycle obj4 = new Vehicle.DisplayMotorcycle();
        obj4.setBrand("Yamaha");
        obj4.setModel("R15 V4");
        obj4.setYear(2023);
        obj4.setSpeed(750);
        obj4.setOdo(1500);
        obj4.setBuild("Sport");
        obj4.outputMotorcycle();
    }
}
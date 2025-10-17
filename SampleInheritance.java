class Vehicle {
    private String brand;
    private int tires;
    private String model;

        public String getBrand() {
            return brand;
        }

        public int getTires() {
            return tires;
        }

        public String getModel() {
            return model;
        }

        public void setBrand(String newValue) {
            brand = newValue;
        }

        public void setTires(int newValue) {
            tires = newValue;
        }

        public void setModel(String newValue) {
            model = newValue;
        }

    public static class Motorcycle extends Vehicle {
        private String engine;
        private String fuelSystem;

        public String getEngine() {
            return engine;
        }

        public String getFuelSystem() {
            return fuelSystem;
        }

        public void setEngine(String newValue) {
            engine = newValue;
        }

        public void setFuelSystem(String newValue) {
            fuelSystem = newValue;
        }
    }


    public static class Bicycle extends Vehicle {
        private String chainType;
        private String shifter;

        public String getChainType() {
            return chainType;
        }

        public String getShifter() {
            return shifter;
        }

        public void setChainType(String newValue) {
            chainType = newValue;
        }

        public void setShifter(String newValue) {
            shifter = newValue;
        }
    }
}



public class SampleInheritance {
    public static void main(String[] args) {
        
        Vehicle.Motorcycle obj = new Vehicle.Motorcycle();
        obj.setBrand("Yamaha");
        obj.setTires(2);
        obj.setModel("R15");
        obj.setEngine("Inline Four");
        obj.setFuelSystem("Fuel-Injection");
        
        System.out.println("Motorcycle Details:");
        System.out.println("Brand: " + obj.getBrand());
        System.out.println("Tires: " + obj.getTires());
        System.out.println("Model: " + obj.getModel());
        System.out.println("Engine: " + obj.getEngine());
        System.out.println("Fuel System: " + obj.getFuelSystem());

        Vehicle.Bicycle obj2 = new Vehicle.Bicycle();
        obj2.setBrand("Scott");
        obj2.setTires(2);
        obj2.setModel("Patron 900 Bike");
        obj2.setChainType("Derailleur Chain");
        obj2.setShifter("Trigger Shif");

        System.out.println("\nBicycle Details:");
        System.out.println("Brand: " + obj2.getBrand());
        System.out.println("Tires: " + obj2.getTires());
        System.out.println("Model: " + obj2.getModel());
        System.out.println("Chain Type: " + obj2.getChainType());
        System.out.println("Shifter: " + obj2.getShifter());

    }
}

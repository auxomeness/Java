class Animal {

    private String name;
    private int age;
    private String type;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String newValue) {
        name = newValue;
    }

    public void setAge(int newValue) {
        age = newValue;
    }

    public void setType(String newValue) {
        type = newValue;
    }

    public static class LandAnimal extends Animal {

        private String habitat;
        private String diet;

        public String getHabitat() {
            return habitat;
        }

        public String getDiet() {
            return diet;
        }

        public void setHabitat(String newValue) {
            habitat = newValue;
        }

        public void setDiet(String newValue) {
            diet = newValue;
        }
    }

    public static class WaterAnimal extends Animal {

        private String waterType;
        private String size;

        public String getWaterType() {
            return waterType;
        }

        public String getSize() {
            return size;
        }

        public void setWaterType(String newValue) {
            waterType = newValue;
        }

        public void setSize(String newValue) {
            size = newValue;
        }
    }

   public static class Output extends Animal.LandAnimal{

         public void display(){
              System.out.println("Name: "+getName());
              System.out.println("Age: "+getAge());
              System.out.println("Type: "+getType());
              System.out.println("Habitat: "+getHabitat());
              System.out.println("Diet: "+getDiet());
         }
   }

   public static class Output2 extends Animal.WaterAnimal{

         public void display(){
              System.out.println("Name: "+getName());
              System.out.println("Age: "+getAge());
              System.out.println("Type: "+getType());
              System.out.println("Water Type: "+getWaterType());
              System.out.println("Size: "+getSize());
         }
   }
}

public class InheritancePractice {
    public static void main(String[] args) {
        
     Animal.Output obj = new Animal.Output();
     obj.setName("Lion");
     obj.setAge(5);
     obj.setType("Mammal");
     obj.setHabitat("Savannah");
     obj.setDiet("Carnivore");
     System.out.println("Land Animal Details:");
     obj.display();
     
    System.out.println("---------------------");

    Animal.Output2 obj2 = new Animal.Output2();
     obj2.setName("Shark");
     obj2.setAge(8);
     obj2.setType("Fish");
     obj2.setWaterType("Saltwater");
     obj2.setSize("Large");
     System.out.println("Water Animal Details:");
     obj2.display();
    }
}
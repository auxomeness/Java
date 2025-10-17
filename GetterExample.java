class Encapsulation {
    private String name;
    private String id;
    private int age;

    public String getStudName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setStudName(String newValue) {
        name = newValue;
    }

    public void setId(String newValue) {
        id = newValue;
    }

    public void setAge(int newValue) {
        age = newValue;
    }
}

public class GetterExample {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        obj.setStudName("Karl Austin");
        obj.setId("CO202400586");
        obj.setAge(20);

        System.out.println("Student Name: " + obj.getStudName());
        System.out.println("Student ID: " + obj.getId());
        System.out.println("Student Age: " + obj.getAge());
    }
}
package Demo;

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age, Human obj) {
        Human obj1 = obj;
        obj1.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulationDemo {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setAge(11, obj);
        obj.setName("Reetej");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }

}

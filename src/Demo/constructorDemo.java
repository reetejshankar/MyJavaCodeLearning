package Demo;

class HumanMan {
    private int age;
    private String name;

    public HumanMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class constructorDemo {
    public static void main(String[] args) {
        HumanMan obj = new HumanMan("Reetej", 20);
        System.out.println(obj.getName() + " : " + obj.getAge());

        HumanMan obj1 = new HumanMan("Jeeya", 16);
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }

}

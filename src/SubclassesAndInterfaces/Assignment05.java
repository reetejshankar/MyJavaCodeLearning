package SubclassesAndInterfaces;

class Employee {

    public String id;
    public String name;
    public int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Enter employee Details");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }
}

@FunctionalInterface
interface ICalculateCommission {
    double calcCummission(double sales);
}

class PartTimeEmployee extends Employee {

    public String shift;
    public float sales;

    public PartTimeEmployee(String id, String name, int salary, String shift, float sales) {
        super(id, name, salary);
        this.shift = shift;
        this.sales = sales;
    }

    @Override
    public void displayDetails() {
        System.out.println("Enter employee Details");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
        System.out.println("Shift (AM/PM): " + shift);
        System.out.println("Sales: " + sales);
    }
}

public class Assignment05 {
    public static void main(String[] args) {

        ICalculateCommission com = (sales) -> {
            if (sales > 5000) {
                return sales * 0.20; // 20% commission
            } else {
                return sales * 0.05; // 5% commission
            }
        };

        PartTimeEmployee obj = new PartTimeEmployee("E001", "Reetej", 40000, "PM", 6000);
        obj.displayDetails();
        double commission1 = com.calcCummission(obj.sales);
        System.out.println("Commission for " + obj.name + ": " + commission1);

        System.out.println("------------------------------");

        PartTimeEmployee obj1 = new PartTimeEmployee("E002", "Jeeya", 50000, "PM", 4000);
        obj1.displayDetails();
        double commission2 = com.calcCummission(obj1.sales);
        System.out.println("Commission for " + obj1.name + ": " + commission2);
    }
}


package SubclassesAndInterfaces;

public class OverridingMethod {

    public static class Employee {
        private final String id, name;
        private final float salary;

        public Employee(String id, String name, float salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public void displayDetails() {
            System.out.println("Employee id: " + id);
            System.out.println("Employee name: " + name);
            System.out.println("Salary: $" + salary);
        }
    }

    public static class ContractEmployee extends Employee {
        int duration;

        public ContractEmployee(String id, String name, float salary, int duration) {
            super(id, name, salary);
            this.duration = duration;
        }

        // overridden method
        @Override
        public void displayDetails() {
            System.out.println("Employee details");
            super.displayDetails();
            System.out.println("Contract duration: " + duration + " months");
        }
    }

    public static void main(String[] args) {

        ContractEmployee emp1 = new ContractEmployee("Emp1", "Reetej Singh", 80000f, 6);
        emp1.displayDetails();
    }
}

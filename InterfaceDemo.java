interface Employee {
    void calculateSalary();
    void calculateBonus();
    void displayDetails();
}
class Manager implements Employee {
    String name;
    int id;
    double basicSalary;
    double bonus;
    double totalSalary;
    Manager(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }
    public void calculateSalary() {
        totalSalary = basicSalary + (basicSalary * 0.20);
    }
    public void calculateBonus() {
        bonus = basicSalary * 0.10;
    }
    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Bonus         : " + bonus);
        System.out.println("Total Salary  : " + totalSalary);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Tharish reddy", 93, 30000);
        m.calculateSalary();
        m.calculateBonus();
        m.displayDetails();
    }
}
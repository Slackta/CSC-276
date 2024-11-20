package Package;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Alice", "123-45-6789"));
        employees.add(new PartTimeEmployee("Bob", "234-56-7890", 20.00, 80));
        employees.add(new Contractor("Carol", "345-67-8901", 1200.00));
        employees.add(new SeasonalEmployee("Dave", "456-78-9012", 15.00, 60, "Winter"));

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Pay: $" + (int) emp.calculatePay());
            System.out.println();
        }
    }
}
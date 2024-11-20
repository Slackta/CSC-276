package Package;

abstract class Employee {
    String name;
    String SSN;

    public Employee(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
    }

    public abstract double calculatePay();

    public void displayInfo() {
        System.out.print("Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary = 3000.00;

    public FullTimeEmployee(String name, String SSN) {
        super(name, SSN);
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" (Full-Time Employee)");
        System.out.println("Monthly Pay: $" + (int) monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int numHours;

    public PartTimeEmployee(String name, String SSN, double hourlyRate, int numHours) {
        super(name, SSN);
        this.hourlyRate = hourlyRate;
        this.numHours = numHours;
    }

    public int getNumHours() {
        return numHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numHours;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" (Part-Time Employee)");
        System.out.println("Hourly Wage: $" + (int) hourlyRate + ", Hours Worked: " + numHours);
    }
}

class Contractor extends Employee {
    private double weeklyRate;

    public Contractor(String name, String SSN, double weeklyRate) {
        super(name, SSN);
        this.weeklyRate = weeklyRate;
    }

    @Override
    public double calculatePay() {
        return weeklyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" (Contractor)");
        System.out.println("Weekly Payment: $" + (int) weeklyRate);
    }
}

class SeasonalEmployee extends PartTimeEmployee {
    private String season;
    private static final double SEASONAL_BONUS = 200.00;

    public SeasonalEmployee(String name, String SSN, double hourlyRate, int numHours, String season) {
        super(name, SSN, hourlyRate, numHours);
        this.season = season;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + SEASONAL_BONUS;
    }

    @Override
    public void displayInfo() {
        System.out.print("Name: " + super.name + " (Seasonal Employee - " + season + ")\n");
        System.out.println("Hourly Wage: $" + (int) getHourlyRate() + ", Hours Worked: " + getNumHours() + ", Seasonal Bonus: $" + (int) SEASONAL_BONUS);
    }
}
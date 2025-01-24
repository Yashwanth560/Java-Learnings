class Employee {
    String name;
    int id;
    String designation;
    double basicSalary;

    public Employee(String name, int id, String designation, double basicSalary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double hra; // House Rent Allowance
    double da;  // Dearness Allowance

    public FullTimeEmployee(String name, int id, double basicSalary, double hra, double da) {
        super(name, id, "Full-Time", basicSalary);
        this.hra = hra;
        this.da = da;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + hra + da;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyWage, int hoursWorked) {
        super(name, id, "Part-Time", 0);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee("Alice", 101, 50000, 10000, 5000);
        PartTimeEmployee ptEmployee = new PartTimeEmployee("Bob", 102, 50, 80);

        ftEmployee.displayDetails();
        ptEmployee.displayDetails();
    }
}

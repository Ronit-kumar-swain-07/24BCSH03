// Base class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name : " + name);
    }
}

// Derived class Employee
class Emp extends Person {
    private int empid;

    Emp(String name, int empid) {
        super(name);
        this.empid = empid;
    }

    @Override
    void display() {
        super.display(); // show name
        System.out.println("EmpID : " + empid);
    }

    int getEmpid() {
        return empid;
    }
}

// Derived class HourlyEmployee
class HourlyEmployee extends Emp {
    private double hourlyRate;
    private double hoursWorked;

    HourlyEmployee(String name, int empid, double hourlyRate, double hoursWorked) {
        super(name, empid);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double getGrossPay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void display() {
        super.display(); // show name + empid
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println("Hours worked : " + hoursWorked);
        System.out.println("Gross pay : " + getGrossPay());
    }
}

// Driver class
public class Employee {
    public static void main(String[] args) {
        // Hardcoded as per example
        HourlyEmployee he = new HourlyEmployee("John Smith", 7569, 100, 2000);
        he.display();
    }
}

public class Employee {
    int empId;
    String empName;
    int deptNo;
    double salary;

    public Employee(int empId, String empName, int deptNo, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptNo = deptNo;
        this.salary = salary;
    }
    public void display() {
        System.out.println("Employee Details:");
        System.out.println("ID       : " + empId);
        System.out.println("Name     : " + empName);
        System.out.println("Dept No. : " + deptNo);
        System.out.println("Salary   : " + salary);
    }

    public static void main(String[] args) 
{
        if (args.length != 4) {
            System.out.println("Error: Please provide exactly 4 arguments.");
            return;
        }
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        int dept = Integer.parseInt(args[2]);
        double sal = Double.parseDouble(args[3]);
        Employee emp = new Employee(id, name, dept, sal);
        emp.display();
    }
}

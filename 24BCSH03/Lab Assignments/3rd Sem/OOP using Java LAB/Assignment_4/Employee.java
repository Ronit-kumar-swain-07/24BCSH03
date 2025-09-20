/*
5.	Write a program to declare a class employee with data members empid, ename, dept, sal. Add a method getData(), putData() to accept 
and display the details of n employees. Define a driver class to create the objects of employee class and perform basic operations.

 */
import java.util.Scanner;
class Employee {
    int empid;
    String ename, dept;
    double sal;

    void getData(int id, String name, String dep, double s) {
        empid = id;
        ename = name;
        dept = dep;
        sal = s;
    }

    void putData() {
        System.out.println(empid + " | " + ename + " | " + dept + " | " + sal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] arr = new Employee[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Employee();
            System.out.println("Enter details of employee " + (i + 1));
            System.out.print("Enter Emp ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Dept: ");
            String dept = sc.nextLine();
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            arr[i].getData(id, name, dept, sal);
        }

        System.out.println("\nEmployee Details:");
        for (Employee e : arr) {
            e.putData();
        }
        sc.close();
    }
}
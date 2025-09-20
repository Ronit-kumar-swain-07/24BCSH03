/*
6.	Define a class Student having the attribute regNo,  stdName,  branch and CGPA. Write 2 methods to accept and display the student details.
Read the details of 50 students using an array of Student class object. Display the student details who has secured the highest CGPA.
 */

// Student.java
class CGPA {
    int regNo;
    String stdName, branch;
    double CGPA;

    void accept(int reg, String name, String br, double cgpa) {
        regNo = reg;
        stdName = name;
        branch = br;
        CGPA = cgpa;
    }

    void display() {
        System.out.println(regNo + " | " + stdName + " | " + branch + " | " + CGPA);
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        CGPA[] s = new CGPA[50];

        for (int i = 0; i < 5; i++) {
            s[i] = new CGPA();
            System.out.println("Enter details of Student " + (i + 1));
            System.out.print("Enter Redg. No. : ");
            int reg = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name : ");
            String name = sc.nextLine();
            System.out.print("Enter Branch : ");
            String branch = sc.nextLine();
            System.out.print("Enter CGPA : ");
            double cgpa = sc.nextDouble();
            sc.nextLine();

            s[i].accept(reg, name, branch, cgpa);
        }

        int maxIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (s[i].CGPA > s[maxIndex].CGPA) {
                maxIndex = i;
            }
        }

        System.out.println("\nStudent with Highest CGPA:");
        s[maxIndex].display();

        sc.close();
    }
}

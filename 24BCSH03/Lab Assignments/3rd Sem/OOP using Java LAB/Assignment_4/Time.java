/*
10.	Design a class ‘Time’ having data members as hour, minute and second. The class should have a parameterized constructor to initialize 
its data members. It should also have methods displayTime() to display the time in HH:MM:SS format and addTime() to add two times. 
Test these methods by creating a main method in another class.
 */

import java.util.Scanner;
class Time {
    int hour, minute, second;

    Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    Time addTime(Time t) {
        int totalSec = this.second + t.second;
        int totalMin = this.minute + t.minute + totalSec / 60;
        int totalHr = this.hour + t.hour + totalMin / 60;

        return new Time(totalHr, totalMin % 60, totalSec % 60);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hours Minutes and Seconds of the First Time : ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        System.out.print("Enter the Hours Minutes and Seconds of the Second Time : ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        Time t1 = new Time(h1,m1,s1);
        Time t2 = new Time(h2,m2,s2);

        System.out.print("First Time: ");
        t1.displayTime();

        System.out.print("Second Time: ");
        t2.displayTime();

        Time sum = t1.addTime(t2);
        System.out.print("Sum: ");
        sum.displayTime();
        sc.close();
    }
}

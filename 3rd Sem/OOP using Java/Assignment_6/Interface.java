/*
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Hello from Printable interface");
    }

    public void show() {
        System.out.println("Hello from Showable interface");
    }
}

public class Interface {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        d.show();
    }
}
*/

interface Sports { // First
    void play();
}

interface Reads { // Second
    void read();
}

interface Writes { // Third
    void write();
}

class Student implements Sports, Reads {
    public void play() {
        System.out.println("The student is Playing.");
    }

    public void read() {
        System.out.println("The Student is Reading.");
    }

    public void write() {
        System.out.println("The Student is Writing.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Student s = new Student();
        s.play(); // from Sports
        s.read(); // from Studies
        s.write(); // from Writes
    }
}

//8.	Write a java program that will create two threads. Set the priority to each thread and display.
//Code:
class Priority extends Thread {
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

class Q8 {
    public static void main(String[] args) {
        Priority t1 = new Priority();
        Priority t2 = new Priority();
        t1.setPriority(2);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}

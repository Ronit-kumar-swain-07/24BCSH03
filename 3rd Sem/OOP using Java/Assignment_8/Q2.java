/*
2. .	Write a java program that will create a thread and set the thread name, display the thread name, get the thread id, 
check the thread is currently alive or not.
*/

// Code:
class MyThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("The new name of the thread: " + t.getName());
        System.out.println("Id: " + t.getId());
        System.out.println("Is Alive: " + t.isAlive());
    }
}

class Q2 {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.setName("My Thread");
        t1.start();
    }
}
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Main thread completed");
    }
}
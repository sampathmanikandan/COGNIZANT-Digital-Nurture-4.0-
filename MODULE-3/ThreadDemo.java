class MyThread extends Thread {
    private String message;

    MyThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Hello from Thread 1");
        MyThread t2 = new MyThread("Hello from Thread 2");

        t1.start();
        t2.start();
    }
}

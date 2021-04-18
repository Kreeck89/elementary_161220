package lesson23.thread;

public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("message from CustomRunnable with name: " + Thread.currentThread().getName());
    }
}

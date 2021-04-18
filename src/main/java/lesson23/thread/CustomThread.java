package lesson23.thread;

import lombok.SneakyThrows;

public class CustomThread extends Thread {

    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(1000);
        System.out.println("message from CustomThread with name: " + Thread.currentThread().getName());
    }
}

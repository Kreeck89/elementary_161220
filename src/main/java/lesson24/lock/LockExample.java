package lesson24.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    Lock lock = new ReentrantLock();

    public void print() {
        lock.lock();
        for (int i = 0; i < 100; i++) {
            System.out.println("printprintprintprint");
        }
    }

    //middle method

    public void write() {
        for (int i = 0; i < 100; i++) {
            System.out.println("write");
        }
        lock.unlock();
    }
}

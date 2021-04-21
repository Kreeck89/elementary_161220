package lesson24;

import lesson24.lock.LockExample;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static volatile int volatileInt = 0;

    private static int integer = 0;
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    private static LockExample lockExample = new LockExample();

    public static void main(String[] args) throws InterruptedException {
        //WAIT vs NOTIFY:
//        Object key = new Object();
//        Thread thread = new Thread(() -> {
//            synchronized (key) {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Thread is running: " + Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                key.notify();
//            }
//        });
//        thread.start();
//        synchronized (key) {
//            key.wait();
//        }
//
//        System.out.println("Finished");

        //VOLATILE:
//        Thread thread1 = new Thread(() -> {
//            while (volatileInt < 10) {
//                System.out.println("Thread1. volatileInt:" + ++volatileInt);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            int cachedInt = volatileInt;
//            while (volatileInt < 10) {
//                if (cachedInt != volatileInt) {
//                    System.out.println("Thread2. volatileInt:" + volatileInt);
//                    cachedInt = volatileInt;
//                }
//            }
//        });
//
//        thread1.start();
//        thread2.start();

        //ATOMIC:
//        for (int j = 0; j < 100000; j++) {
//            Thread thread = new Thread(() -> {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
////                integer++;
//                atomicInteger.incrementAndGet();
//            });
//            thread.start();
//        }
//        Thread.sleep(2000);
////        System.out.println("integer: " + integer);
//        System.out.println("AtomicInteger: " + atomicInteger.get());

        //LOCK:
//        Thread thread1 = new Thread(new Runnable() {
//            private LockExample lockExam = lockExample;
//
//            @Override
//            public void run() {
//                lockExam.print();
//                lockExam.write();
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            private LockExample lockExam = lockExample;
//
//            @Override
//            public void run() {
//                lockExam.print();
//                lockExam.write();
//            }
//        });
//
//        thread1.start();
//        thread2.start();

        //EXECUTOR SERVICE:
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> System.out.println("Hello from executor service pool. Thread: " + Thread.currentThread().getName()));
        executorService.execute(() -> System.out.println("Hello from executor service pool. Thread: " + Thread.currentThread().getName()));
        executorService.execute(() -> System.out.println("Hello from executor service pool. Thread: " + Thread.currentThread().getName()));
        executorService.execute(() -> System.out.println("Hello from executor service pool. Thread: " + Thread.currentThread().getName()));
        executorService.execute(() -> System.out.println("Hello from executor service pool. Thread: " + Thread.currentThread().getName()));
        executorService.execute(() -> System.out.println("Hello from executor service pool. Thread: " + Thread.currentThread().getName()));
        executorService.shutdown();
    }
}

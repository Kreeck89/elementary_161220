package lesson23;

import lesson23.deadlock.FirstClass;
import lesson23.deadlock.SecondClass;
import lesson23.thread.CustomCallable;
import lesson23.thread.CustomRunnable;
import lesson23.thread.CustomThread;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    private static Integer INTEGER_INCREMENT = 0;


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //СОЗДАНИЕ ПОТОКОВ И ПРИМЕНЕНИЕ МЕТОДОВ
//        System.out.println("Thread: " + Thread.currentThread().getName());
//
//        CustomThread customThread = new CustomThread();
////        customThread.run(); // Не запускает в отдельном потоке!!!
//        customThread.start();
////        customThread.start(); // Невозможно запустить поток повторно!!!
//
//        System.out.println("customThread.isAlive(): " + customThread.isAlive());
//        customThread.interrupt();
////        customThread.stop(); // Не применять!!!!
//        Thread.sleep(1000);
////        System.out.println("customThread.isInterrupted(): " + customThread.isInterrupted()); //Работает не ожидаемым образом!
//        System.out.println("customThread.isAlive(): " + customThread.isAlive());
//
//        System.out.println("Thread: " + Thread.currentThread().getName());
//
//        CustomRunnable customRunnable = new CustomRunnable();
//        Thread customRunnableThread = new Thread(customRunnable);
//        customRunnableThread.setName("CUSTOM_RUNNABLE");
//        customRunnableThread.setPriority(Thread.MAX_PRIORITY);
//
//        customRunnableThread.start();
//
//        System.out.println("Thread: " + Thread.currentThread().getName());
//
//        CustomCallable customCallable = new CustomCallable();
//        FutureTask<String> task = new FutureTask<>(customCallable);
//        Thread customCallableThread = new Thread(task);
//        customCallableThread.start();
//        String customCallableResult = task.get();
//        System.out.println(customCallableResult);
//
//        System.out.println("Thread: " + Thread.currentThread().getName());
//        System.out.println("customThread.isAlive(): " + customThread.isAlive());
//
//
//        CustomThread customThread1 = new CustomThread();
//        customThread1.setName("CUSTOM_THREAD");
//        customThread1.start();
//        customThread1.join();
//
//        System.out.println("Thread last: " + Thread.currentThread().getName());
//        System.out.println("Thread last: " + Thread.currentThread().getName());
//        System.out.println("Thread last: " + Thread.currentThread().getName());
//        System.out.println("Thread last: " + Thread.currentThread().getName());
//        System.out.println("Thread last: " + Thread.currentThread().getName());

        //СИНХРОНИЗАЦИЯ МЕТОДОВ И ПРИМЕР ВЫЗОВОВ:
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(Main::printWithBlock);
//            thread.start();
//        }

        Object key = new Object();
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(() -> printWithObject(key));
//            thread.start();
//        }
        //COPY FOR SECOND OBJECT:
//        Object key2 = new Object();
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(() -> printWithObject(key2));
//            thread.start();
//        }


        //DEADLOCK EXAMPLE:
        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();

        firstClass.setSecondClass(secondClass);
        secondClass.setFirstClass(firstClass);

        Thread thread1 = new Thread(() -> System.out.println(firstClass.getStringFromSecondClass()));
        Thread thread2 = new Thread(() -> System.out.println(secondClass.getStringFromFirstClass()));

        thread1.start();
        thread2.start();
    }

    private synchronized static void print() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + INTEGER_INCREMENT++);
        }
    }

    private static void printWithBlock() {
        System.out.println(Thread.currentThread().getName() + ": NOT synchronized PART OF PROGRAM");

        synchronized (Main.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + INTEGER_INCREMENT++);
            }
        }
    }

    private static void printWithObject(Object key) {
        System.out.println(Thread.currentThread().getName() + ": NOT synchronized PART OF PROGRAM");

        synchronized (key) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + INTEGER_INCREMENT++);
            }
        }
    }
}

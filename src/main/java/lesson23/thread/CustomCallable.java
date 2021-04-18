package lesson23.thread;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
//        Thread.currentThread().setName("someName");
        return "message from CustomCallable with name: " + Thread.currentThread().getName();
    }
}

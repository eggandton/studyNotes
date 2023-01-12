package com.zql.thread.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "MyCallable";
    }

    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> stringFutureTask = new FutureTask<>(myCallable);
        new Thread(stringFutureTask).start();
        try {
            String s = stringFutureTask.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

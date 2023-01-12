package com.zql.thread.synchronizedandlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotifyExample {

    synchronized void test() {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("test");
    }

    synchronized void test2() {
        notify();
        System.out.println("test2");
    }

    public static void main(String[] args) {
        WaitNotifyExample waitNotifyExample = new WaitNotifyExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            waitNotifyExample.test();
        });
        executorService.execute(()->{
            waitNotifyExample.test2();
        });
    }

}

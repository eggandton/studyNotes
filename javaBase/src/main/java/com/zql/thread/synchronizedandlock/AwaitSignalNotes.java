package com.zql.thread.synchronizedandlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AwaitSignalNotes {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void test(){
        lock.lock();
        try {
            System.out.println("teststart");
            condition.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("test");
    }

    public void test2(){
        lock.lock();
        try {
            System.out.println("test2start");
            condition.signal();
        } finally {
            lock.unlock();
        }
        System.out.println("test2");
    }

    public static void main(String[] args) {
        AwaitSignalNotes awaitSignalNotes = new AwaitSignalNotes();
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(()->{
            awaitSignalNotes.test();
        });
        executorService.execute(()->{
            awaitSignalNotes.test2();
        });

    }
}

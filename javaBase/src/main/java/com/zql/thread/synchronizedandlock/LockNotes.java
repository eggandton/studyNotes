package com.zql.thread.synchronizedandlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockNotes {

    private Lock lock = new ReentrantLock();

    public void test() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        LockNotes lockNotes = new LockNotes();
        LockNotes lockNotes1 = new LockNotes();
        executorService.execute(()->{
            lockNotes.test();
        });
        executorService.execute(()->{
            lockNotes.test();
        });
        executorService.execute(()->{
            lockNotes1.test();
        });
    }

}

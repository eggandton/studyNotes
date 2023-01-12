package com.zql.thread.synchronizedandlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedNotes {

    public void test() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }
    }

    public synchronized static void test2() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public void test3() {
        synchronized (SynchronizedNotes.class) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedNotes synchronizedNotes = new SynchronizedNotes();
        SynchronizedNotes synchronizedNotes1 = new SynchronizedNotes();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            synchronizedNotes.test();
        });
        executorService.execute(()->{
            synchronizedNotes.test();
        });
        executorService.execute(()->{
            synchronizedNotes1.test();
        });
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end");

        executorService.execute(()->{
            SynchronizedNotes.test2();
        });
        executorService.execute(()->{
            SynchronizedNotes.test2();
        });


    }

}

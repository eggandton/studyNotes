package com.zql.thread.example;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunable");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
    }
}

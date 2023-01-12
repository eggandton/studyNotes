package com.zql.thread.example;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

}

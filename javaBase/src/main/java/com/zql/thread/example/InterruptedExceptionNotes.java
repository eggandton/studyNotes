package com.zql.thread.example;

public class InterruptedExceptionNotes {

    /*
    通过调用一个线程的 interrupt() 来中断该线程，如果该线程处于阻塞、限期等待或者无限期等待状态，
    那么就会抛出 InterruptedException，从而提前结束该线程。但是不能中断 I/O 阻塞和 synchronized 锁阻塞。
    对于以下代码，在 main() 中启动一个线程之后再中断它，由于线程中调用了 Thread.sleep() 方法，因此会抛出一个 InterruptedException，
    从而提前结束线程，不执行之后的语句
     */
    public static class InterruptedThread extends Thread {
        @Override
        public void run() {
            try {
                System.out.println("InterruptedThread start");
                Thread.sleep(1000);
                System.out.println("InterruptedThread end");
            } catch (InterruptedException e) {
                throw new RuntimeException(String.format("线程 %s 被中断%s", Thread.currentThread().getName(),e));
            }
        }
    }

    public static void main(String[] args) {
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        interruptedThread.interrupt();
        System.out.println("main");
    }
}

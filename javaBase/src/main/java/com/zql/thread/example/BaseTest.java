package com.zql.thread.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BaseTest {

    public static void main(String[] args) {
        /*
        CachedThreadPool: 一个任务创建一个线程；
        FixedThreadPool: 所有任务只能使用固定大小的线程；
        SingleThreadExecutor: 相当于大小为 1 的 FixedThreadPool。

         */
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }

        Thread thread = new Thread(new MyRunnable());
        thread.setDaemon(true);

        /*
        sleep()Thread.sleep(millisec) 方法会休眠当前正在执行的线程，millisec 单位为毫秒。sleep() 可能会抛出 InterruptedException，因为异常不能跨线程传播回 main() 中，因此必须在本地进行处理。线程中抛出的其它异常也同样需要在本地进行处理。
        yield()对静态方法 Thread.yield() 的调用声明了当前线程已经完成了生命周期中最重要的部分，可以切换给其它线程来执行。该方法只是对线程调度器的一个建议，而且也只是建议具有相同优先级的其它线程可以运行。
         */
    }
}

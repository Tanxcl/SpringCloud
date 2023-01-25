package com.business.study;

/**
 * @className: ThreadTest
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/24 22:52
 **/
public class ThreadTest extends Thread{
    @Override
    public void run() {
        super.run();
    }


    /**
     * 状态：新建、就绪、运行、阻塞、消亡
     * 创建线程：继承Thread类重写run方法
     *          实现Runnable接口
     *          线程Callable
     *
     * 线程安全：使用Synchronized代码块（代码块、方法、类、静态方法）
     *          使用look锁
     * 线程有哪些方法：sleep、yield、start、run、join
     * Object：wait、notify、notifyAll
     * 并发：
     */
}

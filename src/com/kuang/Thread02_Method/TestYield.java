package com.kuang.Thread02_Method;

/**
 * @Author Orust
 * @Create 2021/3/15 15:59
 */

// 测试礼让线程
// 礼让不一定成功，看CPU心情-_-
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield, "A").start();
        new Thread(myYield, "B").start();
    }
}

class MyYield implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始执行");
        Thread.yield();//线程礼让
        System.out.println(Thread.currentThread().getName() + "线程结束执行");
    }
}
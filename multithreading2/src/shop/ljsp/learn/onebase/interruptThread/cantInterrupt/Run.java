package shop.ljsp.learn.onebase.interruptThread.cantInterrupt;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
1） this. interrupted（）： 测试 当前 线程 是否 已经 是 中断 状态， 执行 后 具有 将 状态 标志 置 清除 为 false 的 功能。
2） this. isInterrupted（）： 测试 线程 Thread 对象 是否 已经 是 中断 状态， 但不 清除 状态 标志。


 */
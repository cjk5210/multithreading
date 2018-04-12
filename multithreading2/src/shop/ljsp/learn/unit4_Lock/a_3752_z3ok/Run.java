package shop.ljsp.learn.unit4_Lock.a_3752_z3ok;

import shop.ljsp.learn.unit4_Lock.a_3677_ReentrantLockTest.MyThread;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
    }
}

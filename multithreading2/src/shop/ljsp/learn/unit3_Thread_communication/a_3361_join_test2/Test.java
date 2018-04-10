package shop.ljsp.learn.unit3_Thread_communication.a_3361_join_test2;

import shop.ljsp.learn.unit1.bradomthread.Mythread;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("我想当threadTest对象执行完毕后我再执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

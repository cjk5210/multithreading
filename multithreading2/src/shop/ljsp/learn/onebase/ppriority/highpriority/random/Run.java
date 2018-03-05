package shop.ljsp.learn.onebase.ppriority.highpriority.random;

import shop.ljsp.learn.onebase.pyield.MyThread;

public class Run {
    public static void main(String[] args) {

        for (int i=0;i<5;i++) {
            MyThread1 thread1=new MyThread1();
            thread1.setPriority(5);
            thread1.start();
            MyThread2 thread2=new MyThread2();
            thread2.setPriority(6);
            thread2.start();
        }

    }
}

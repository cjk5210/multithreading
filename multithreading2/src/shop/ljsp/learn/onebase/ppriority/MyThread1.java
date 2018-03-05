package shop.ljsp.learn.onebase.ppriority;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority="+this.getPriority());
        MyThread2 thread=new MyThread2();
        thread.start();
    }
}

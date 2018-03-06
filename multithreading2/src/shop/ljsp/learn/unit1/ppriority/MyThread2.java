package shop.ljsp.learn.unit1.ppriority;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority="+this.getPriority());
    }
}

package shop.ljsp.learn.onebase.isAlive;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run="+this.isAlive());
    }
}

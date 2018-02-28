package shop.ljsp.learn.onebase.jisAlive;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run="+this.isAlive());
    }
}

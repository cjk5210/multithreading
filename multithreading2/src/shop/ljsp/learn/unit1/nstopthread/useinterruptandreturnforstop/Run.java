package shop.ljsp.learn.unit1.nstopthread.useinterruptandreturnforstop;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread t=new MyThread();
            t.start();
            Thread.sleep(2000);
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

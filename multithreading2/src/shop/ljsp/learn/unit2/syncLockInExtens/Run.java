package shop.ljsp.learn.unit2.syncLockInExtens;

public class Run {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}

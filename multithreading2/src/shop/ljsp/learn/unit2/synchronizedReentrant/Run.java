package shop.ljsp.learn.unit2.synchronizedReentrant;

public class Run {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();

    }
}

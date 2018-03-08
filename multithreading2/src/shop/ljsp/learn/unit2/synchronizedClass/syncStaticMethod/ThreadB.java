package shop.ljsp.learn.unit2.synchronizedClass.syncStaticMethod;

public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}

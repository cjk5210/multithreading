package shop.ljsp.learn.unit2.synchronizedClass.syncStaticMethod;

public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}

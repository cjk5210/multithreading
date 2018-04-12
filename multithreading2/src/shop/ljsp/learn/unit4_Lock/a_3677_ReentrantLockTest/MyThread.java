package shop.ljsp.learn.unit4_Lock.a_3677_ReentrantLockTest;

public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}

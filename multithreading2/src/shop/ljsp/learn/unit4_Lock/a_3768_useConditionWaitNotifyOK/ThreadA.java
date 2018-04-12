package shop.ljsp.learn.unit4_Lock.a_3768_useConditionWaitNotifyOK;

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}

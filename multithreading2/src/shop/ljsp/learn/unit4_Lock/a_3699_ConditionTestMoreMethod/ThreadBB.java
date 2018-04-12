package shop.ljsp.learn.unit4_Lock.a_3699_ConditionTestMoreMethod;

public class ThreadBB extends Thread {
    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}

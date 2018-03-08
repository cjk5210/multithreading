package shop.ljsp.learn.unit2.ThrowExceptionNoLock;

public class ThreadA extends Thread {
    private Service service;
    public  ThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}

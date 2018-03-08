package shop.ljsp.learn.unit2.testSynchronizedx.snychronizedX;

public class ThreadB extends Thread {
    private Service service;
    private MyObject object;
    public ThreadB(Service service,MyObject object){
        super();
        this.service=service;
        this.object=object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}

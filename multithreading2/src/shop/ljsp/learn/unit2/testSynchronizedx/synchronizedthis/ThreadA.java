package shop.ljsp.learn.unit2.testSynchronizedx.synchronizedthis;

import shop.ljsp.learn.unit2.testSynchronizedx.synchronizedMethod.MyObject;

public class ThreadA extends Thread {
    private Service service;
    private MyObject object;
    public ThreadA(Service service, MyObject object){
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

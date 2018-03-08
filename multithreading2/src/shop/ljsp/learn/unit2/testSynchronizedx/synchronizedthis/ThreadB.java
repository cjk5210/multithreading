package shop.ljsp.learn.unit2.testSynchronizedx.synchronizedthis;

import shop.ljsp.learn.unit2.testSynchronizedx.synchronizedMethod.MyObject;

public class ThreadB extends Thread {
    private MyObject object;
    public ThreadB(MyObject object){
        super();
        this.object=object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}

package shop.ljsp.learn.unit2.twoObjectTwoLock;

public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numref){
        super();
        this.numRef=numref;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}

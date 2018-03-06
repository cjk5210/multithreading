package shop.ljsp.learn.unit2.t1SelfPrivateNum;

public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef){
        super();
        this.numRef=numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}

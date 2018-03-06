package shop.ljsp.learn.unit2.t1SelfPrivateNum;

public class ThreadA extends Thread{
    private  HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef=numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}

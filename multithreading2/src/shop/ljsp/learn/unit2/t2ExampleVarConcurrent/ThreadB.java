package shop.ljsp.learn.unit2.t2ExampleVarConcurrent;

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

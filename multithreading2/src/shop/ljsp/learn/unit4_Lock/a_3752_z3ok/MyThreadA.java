package shop.ljsp.learn.unit4_Lock.a_3752_z3ok;

public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}

package shop.ljsp.learn.unit4_Lock.a_3768_useConditionWaitNotifyOK;

public class Run {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            ThreadA a = new ThreadA(service);
            a.start();
            Thread.sleep(3000);
            service.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

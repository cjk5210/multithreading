package shop.ljsp.learn.unit3_Thread_communication.a_3476_joinMoreTest;

public class RunFirst {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("      main end=" + System.currentTimeMillis());
    }
}

package shop.ljsp.learn.unit3_Thread_communication.a_3476_joinMoreTest;

public class ThreadB extends Thread {
    @Override
    public void run() {

        try {
            System.out.println("begin B ThreadName="
                    + Thread.currentThread().getName()
                    + "   " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" end B ThreadName="
                    + Thread.currentThread().getName()
                    + "  "+ System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

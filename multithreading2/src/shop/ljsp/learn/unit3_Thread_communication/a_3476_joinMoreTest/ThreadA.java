package shop.ljsp.learn.unit3_Thread_communication.a_3476_joinMoreTest;

public class ThreadA extends Thread {
    private  ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (b){
            try {
                System.out.println("begin A ThreadName="
                        + Thread.currentThread().getName()
                        + "   " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println(" end A ThreadName="
                        + Thread.currentThread().getName()
                        + "  "+ System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package shop.ljsp.learn.unit3_Thread_communication.a_2698_waitNotifySize5;



public class Run {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            ThreadA a=new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b=new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

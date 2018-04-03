package shop.ljsp.learn.unit3_Thread_communication.a_2698_waitNotifySize5;

import shop.ljsp.learn.unit3_Thread_communication.a_2604_TwoThreadTransData.ThreadB;

public class ThreadA extends Thread {
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                if(MyList.size()!=5){
                    System.out.println("wait begin "+System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end "+System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

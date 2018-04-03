package shop.ljsp.learn.unit3_Thread_communication.a_2698_waitNotifySize5;

public class ThreadB extends Thread {
    private Object lock;
    public ThreadB(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                for (int i=0;i<10;i++){
                    MyList.add();
                    if(MyList.size()==5){
                        lock.notify();
                        System.out.println("已经发出通知");
                    }
                    System.out.println("添加了"+(i+1)+"个元素");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

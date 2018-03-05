package shop.ljsp.learn.onebase.nstopthread.useinterruptandreturnforstop;

public class MyThread extends Thread{
    @Override
    public void run() {
        while (true){
            if(this.isInterrupted()){
                System.out.println("停止了！");
                return;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
    }
}

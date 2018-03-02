package shop.ljsp.learn.onebase.nstopthread.improvecontinuerun;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();

        for(int i=0;i<500000;i++){
            System.out.println("已经是停止状态了！我要退出了");
        }
    }
}

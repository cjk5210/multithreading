package shop.ljsp.learn.unit1.nstopthread;

public class MyThread  extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i=0;i<500000;i++){
            if(this.isInterrupted()){
                System.out.println("已经是停止状态！我要退出了！");
                break;
            }
            System.out.println("i="+(i+1));
        }
    }
}

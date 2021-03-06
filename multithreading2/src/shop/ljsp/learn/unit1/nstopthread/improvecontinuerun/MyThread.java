package shop.ljsp.learn.unit1.nstopthread.improvecontinuerun;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();

        try {
            for(int i=0;i<500000;i++){
                if(this.isInterrupted()){
                    System.out.println("已经是停止状态了！我要退出了");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("我在for下面");
        } catch (InterruptedException e) {
            System.out.println("进MyThread.java类run方法中的catch了！");
            e.printStackTrace();
        }
    }
}

package shop.ljsp.learn.onebase.nstopthread.continuerunafterinterrupt;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}

/*
i=232043
i=232044
i=232045
已经是停止状态！我要退出了！
我被输出，如果此代码是for又继续运行，线程并未停止！
end!

Process finished with exit code 0
-----------
for循环break之后for循环之外的代码还是会继续执行
 */

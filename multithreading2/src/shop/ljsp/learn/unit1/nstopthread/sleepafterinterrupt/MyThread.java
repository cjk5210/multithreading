package shop.ljsp.learn.unit1.nstopthread.sleepafterinterrupt;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for(int i=0;i<100000;i++){
                System.out.println("i="+(i+1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到了sleep!进入catch!");
            e.printStackTrace();
        }
    }
}
/*
i=99995
i=99996
i=99997
i=99998
i=99999
i=100000
run begin
先停止，再遇到了sleep!进入catch!
java.lang.InterruptedException: sleep interrupted
	at java.lang.Thread.sleep(Native Method)
	at shop.ljsp.learn.unit1.nstopthread.sleepafterinterrupt.MyThread.run(MyThread1.java:12)

Process finished with exit code 0
--------------
Enter into the 'catch' blodk.
 */
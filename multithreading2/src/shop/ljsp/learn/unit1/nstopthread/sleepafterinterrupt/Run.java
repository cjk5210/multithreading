package shop.ljsp.learn.unit1.nstopthread.sleepafterinterrupt;

public class Run {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
/*
i=99998
i=99999
i=100000
run begin
先停止，再遇到了sleep!进入catch!

Process finished with exit code 0
----------
enter into 'catch' block
 */
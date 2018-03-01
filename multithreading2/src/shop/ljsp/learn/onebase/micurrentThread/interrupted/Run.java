package shop.ljsp.learn.onebase.micurrentThread.interrupted;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
//            Thread.currentThread().interrupt();
            System.out.println("是否停止1？="+thread.interrupted());
            System.out.println("是否停止2？="+thread.interrupted());

        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}


/*
i=90579
i=90580
i=90581
i=90582
是否停止1？=false
是否停止2？=false
i=90583
i=90584
------------
thread means 'main' thread,so it never interrupted.
 */

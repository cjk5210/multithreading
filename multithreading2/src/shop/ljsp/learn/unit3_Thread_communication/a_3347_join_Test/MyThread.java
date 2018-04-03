package shop.ljsp.learn.unit3_Thread_communication.a_3347_join_Test;

public class MyThread extends Thread {
    @Override
    public void run() {
        int secondValue=(int)(Math.random()*10000);
    }
}

package shop.ljsp.learn.unit3_Thread_communication.a_3361_join_test2;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int secondValue=(int) (Math.random()*10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

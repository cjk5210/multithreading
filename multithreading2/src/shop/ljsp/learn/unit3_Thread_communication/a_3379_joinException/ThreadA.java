package shop.ljsp.learn.unit3_Thread_communication.a_3379_joinException;

public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
//            System.out.println(i);
        }
    }
}

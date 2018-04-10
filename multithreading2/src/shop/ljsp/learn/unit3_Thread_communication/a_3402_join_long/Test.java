package shop.ljsp.learn.unit3_Thread_communication.a_3402_join_long;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join(2000);

            System.out.println(" end Timer=" + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

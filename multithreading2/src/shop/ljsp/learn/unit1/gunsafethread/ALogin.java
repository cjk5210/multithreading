package shop.ljsp.learn.unit1.gunsafethread;

public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}

package shop.ljsp.learn.unit1.gunsafethread;

public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}

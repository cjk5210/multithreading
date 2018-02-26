package shop.ljsp.learn.onebase.gunsafethread;

public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}

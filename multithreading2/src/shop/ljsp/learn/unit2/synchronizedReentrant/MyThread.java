package shop.ljsp.learn.unit2.synchronizedReentrant;

public class MyThread extends Thread {
    @Override
    public void run() {
        Service service=new Service();
        service.service1();
    }
}

package shop.ljsp.learn.unit2.testSynchronizedx.synchronizedMethod;

public class Run {
    public static void main(String[] args) {
        try {
            Service service=new Service();
            MyObject object=new MyObject();
            ThreadA a=new ThreadA(service,object);
            a.setName("a");
            a.start();
            Thread.sleep(100);
            ThreadB b=new ThreadB(object);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
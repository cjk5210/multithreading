package shop.ljsp.learn.unit1.fsharevariable;

public class MyThread extends Thread {
    private  int count =5;

    @Override
    synchronized  public void run() {
        super.run();
        count--;
        System.out.println("由 "+this.currentThread().getName()+"计算,count="+count);
    }
}

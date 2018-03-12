package shop.ljsp.learn.unit2.twoStopDeadLoop;

public class Service3 {
    synchronized public void methodA(){
        System.out.println("methodA begin");
        boolean isContinueRun=true;
        while (isContinueRun){
        }
        System.out.println("Method end");
    }
    synchronized  public void methodB(){
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}

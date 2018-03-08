package shop.ljsp.learn.unit2.testSynchronizedx.synchronizedthis;

import shop.ljsp.learn.unit2.testSynchronizedx.synchronizedMethod.ThreadB;

public class Myobject {
    public void speedPrintString(){
        synchronized (this){
            System.out.println("speedPrintString ____getLock time=" +
                    System.currentTimeMillis()+" run ThreadName=" +
                    Thread.currentThread().getName());
            System.out.println("-----------------------");
            System.out.println("speedPrintString releaseLock time=" +
                    System.currentTimeMillis()+" run ThreadName=" +
                    Thread.currentThread().getName());
        }
    }
}

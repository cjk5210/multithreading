package shop.ljsp.learn.unit1.pyield;

public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime=System.currentTimeMillis();
        int count =0;
        for(int i=0;i<50000000;i++){
//            Thread.yield();
            count=count+(i+1);
        }

        long endTime=System.currentTimeMillis();
        System.out.println("count="+count+"--开始时间："+beginTime+"--结束时间："+endTime);
        System.out.println("用时："+(endTime-beginTime));
    }
}

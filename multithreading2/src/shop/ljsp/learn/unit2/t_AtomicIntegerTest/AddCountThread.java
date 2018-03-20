package shop.ljsp.learn.unit2.t_AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
    private AtomicInteger count =new  AtomicInteger(0);

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            System.out.println(count.incrementAndGet());
        }
    }
}

/*
49994
49995
49996
49997
49998
49999
50000

Process finished with exit code 0
 */

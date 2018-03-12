package shop.ljsp.learn.unit2.ThrowExceptionNoLock;

public class Run {
    public static void main(String[] args) {
        try {
            Service service=new Service();
            ThreadA a=new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadB b=new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
/*
Thread B run Time=1520474812019
Thread B run Time=1520474812019
Thread B run Time=1520474812019
ThreadName=a run exceptionTime=1520474812019
Exception in thread "a" java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
	at java.lang.Integer.parseInt(Integer.java:449)
	at java.lang.Integer.parseInt(Integer.java:499)
	at shop.ljsp.learn.unit2.ThrowExceptionNoLock.Service.testMethod(Service3.java:11)
	at shop.ljsp.learn.unit2.ThrowExceptionNoLock.ThreadA.run(ThreadA.java:12)

Process finished with exit code 0
----------
当 一个 线程 执行 的 代码 出现 异常 时， 其所 持 有的 锁 会 自动 释放。
线程 a 出现 异常 并 释放 锁， 线程 b 进入 方法 正常 打印， 实验 的 结论 就是 出现 异常 的 锁 被 自动 释放 了。

 */
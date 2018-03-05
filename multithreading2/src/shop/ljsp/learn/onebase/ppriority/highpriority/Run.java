package shop.ljsp.learn.onebase.ppriority.highpriority;

public class Run {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            MyThread1 thread1=new MyThread1();
            thread1.setPriority(10);
            thread1.start();
            MyThread2 thread2=new MyThread2();
            thread2.setPriority(1);
            thread2.start();
        }
    }
}



/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=58020:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.onebase.ppriority.highpriority.Run
☆☆☆☆☆2 use time=288
★★★★★thread 1 use time=322
★★★★★thread 1 use time=382
★★★★★thread 1 use time=346
★★★★★thread 1 use time=407
☆☆☆☆☆2 use time=366
★★★★★thread 1 use time=386
☆☆☆☆☆2 use time=393
☆☆☆☆☆2 use time=476
☆☆☆☆☆2 use time=459

Process finished with exit code 0
--------------------------------
发现， 高 优先级 的 线程 总是 大部分 先 执行 完， 但不 代表 高 优先级 的 线程 全部 先 执行 完。
 另外， 不要 以为 MyThread1 线程 先 被 main 线程 所 调用 就会 先 执行 完，
  出现 这样 的 结果 全是 因为 MyThread1 线程 的 优先级 是最 高值 为 10 造成 的。
   当 线程 优先级 的 等级 差距 很大 时， 谁先 执行 完 和 代码 的 调用 顺序 无关。



 */
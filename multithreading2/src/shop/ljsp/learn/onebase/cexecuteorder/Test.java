package shop.ljsp.learn.onebase.cexecuteorder;

public class Test {
    public static void main(String[] args) {
        MyThread t11=new MyThread(1);
        MyThread t12=new MyThread(2);
        MyThread t13=new MyThread(3);
        MyThread t14=new MyThread(4);
        MyThread t15=new MyThread(5);
        MyThread t16=new MyThread(6);
        MyThread t17=new MyThread(7);
        MyThread t18=new MyThread(8);
        MyThread t19=new MyThread(9);
        MyThread t110=new MyThread(10);
        MyThread t111=new MyThread(11);
        MyThread t112=new MyThread(12);
        MyThread t113=new MyThread(13);
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        t110.start();
        t111.start();
        t112.start();
        t113.start();



    }
}
/*
"C:\Program Files\Java\jdk1.7.0_75\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=49542:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.7.0_75\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jce.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jfxrt.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\resources.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\rt.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\rt_debugg.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.onebase.cexecuteorder.Test
1
3
7
2
6
5
10
9
13
11
4
8
12

Process finished with exit code 0
　 线程 启动 顺序 与 start（） 执行 顺序 无关


 */
package shop.ljsp.learn.unit1.hunsafethreadprintln;

public class run {
    public static void main(String[] args) {
        MyThread run =new MyThread();
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        Thread t3=new Thread(run);
        Thread t4=new Thread(run);
        Thread t5=new Thread(run);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=52517:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit1.hunsafethreadprintln.run
i=5 threadName=Thread-2
i=4 threadName=Thread-3
i=3 threadName=Thread-1
i=2 threadName=Thread-5
i=1 threadName=Thread-4

Process finished with exit code 0
但是书里边的结果不是这样的,书里边的结果是：
i=5 threadName=Thread-1
i=2 threadName=Thread-5
i=3 threadName=Thread-4
i=4 threadName=Thread-3
i=4 threadName=Thread-2
 */


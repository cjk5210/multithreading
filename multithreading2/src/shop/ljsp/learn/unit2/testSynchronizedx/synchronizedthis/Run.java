package shop.ljsp.learn.unit2.testSynchronizedx.synchronizedthis;

import shop.ljsp.learn.unit2.testSynchronizedx.synchronizedMethod.MyObject;

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

/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=49674:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit2.testSynchronizedx.synchronizedthis.Run
testMethod1 ____getLock time=1520488193489 run ThreadName=a
testMethod1 releaseLock time=Thread[a,5,main] run ThreadName=a
speedPrintString ____getLock time=1520488198489 run ThreadName=b
--------------------
speedPrintString releaseLock time=1520488198489 run ThreadName=b

Process finished with exit code 0
------------

 */

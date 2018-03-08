package shop.ljsp.learn.unit2.testSynchronizedx.snychronizedX;

public class Run1_1 {
    public static void main(String[] args) {
        Service service=new Service();
        MyObject object=new MyObject();
        ThreadA a=new ThreadA(service,object);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(service,object);
        b.setName("b");
        b.start();
    }
}

/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=57161:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit2.testSynchronizedx.snychronizedX.Run1_1
testMethod1 ____getLock time=1520477636928 run ThreadName=a
testMethod1 releaseLock time=1520477638928 run ThreadName=a
testMethod1 ____getLock time=1520477638928 run ThreadName=b
testMethod1 releaseLock time=1520477640928 run ThreadName=b

Process finished with exit code 0
----
锁同一个对象，同步执行
 */

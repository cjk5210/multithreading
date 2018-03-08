package shop.ljsp.learn.unit2.testSynchronizedx.snychronizedX;

public class Run1_2 {
    public static void main(String[] args) {
        Service service=new Service();
        MyObject object1=new MyObject();
        MyObject object2=new MyObject();
        ThreadA a=new ThreadA(service,object1);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(service,object2);
        b.setName("b");
        b.start();
    }
}
/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=57552:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit2.testSynchronizedx.snychronizedX.Run1_2
testMethod1 ____getLock time=1520478427571 run ThreadName=a
testMethod1 ____getLock time=1520478427572 run ThreadName=b
testMethod1 releaseLock time=1520478429572 run ThreadName=a
testMethod1 releaseLock time=1520478429572 run ThreadName=b

Process finished with exit code 0
------
锁不同对象，异步执行
 */
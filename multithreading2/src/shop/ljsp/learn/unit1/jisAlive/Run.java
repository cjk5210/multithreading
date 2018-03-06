package shop.ljsp.learn.unit1.jisAlive;

public class Run {
    public static void main(String[] args) {
        MyThread mythread=new MyThread();
        System.out.println("begin=="+mythread.isAlive());
        mythread.start();
        System.out.println("end=="+mythread.isAlive());

    }
}
/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=64452:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit1.jisAlive.Run
begin==false
end==true
run=true

Process finished with exit code 0
--------------
方法 jisAlive（） 的 作用 是 测试 线程 是否 处于 活动 状态。
如果代码改为
MyThread mythread = new MyThread();
System. out. println(" begin ==" + mythread. jisAlive());
mythread. start();
Thread. ksleep( 1000);
System. out. println(" end ==" + mythread. jisAlive());

子线程在1秒内执行完了，end==false
 */
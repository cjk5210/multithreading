package shop.ljsp.learn.unit1.afirstexample;

public class Run {
    public static void main(String[] args) {
        MyThread mythread=new MyThread();
        mythread.start();
        System.out.println("运行结束！");
    }
}
/*
"C:\Program Files\Java\jdk1.7.0_75\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=65178:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.7.0_75\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jce.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jfxrt.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\resources.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\rt.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\rt_debugg.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit1.afirstexample.Run
运行结束！
MyThread

Process finished with exit code 0
The result tell us,thread will be execute anytime.
 */
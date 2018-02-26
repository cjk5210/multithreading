package shop.ljsp.learn.onebase.eunsharevariable;


public class run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();


    }
}
/*
"C:\Program Files\Java\jdk1.7.0_75\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=51189:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.7.0_75\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jce.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jfxrt.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\resources.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\rt.jar;C:\Program Files\Java\jdk1.7.0_75\jre\lib\rt_debugg.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.onebase.eunsharevariable.run
由 B 计算，count=4
由 B 计算，count=3
由 B 计算，count=2
由 B 计算，count=1
由 B 计算，count=0
由 A 计算，count=4
由 A 计算，count=3
由 A 计算，count=2
由 A 计算，count=1
由 A 计算，count=0
由 C 计算，count=4
由 C 计算，count=3
由 C 计算，count=2
由 C 计算，count=1
由 C 计算，count=0

Process finished with exit code 0
---
Thread a,b,c use it's self count variable.
 */
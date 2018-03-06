package shop.ljsp.learn.unit1.jisAlive.otherIsAliveTest;

public class Run {
    public static void main(String[] args) {
        CountOperate c=new CountOperate();
        Thread t1=new Thread(c);
        System.out.println("main begin t1 is alive="+t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 jisAlive="+t1.isAlive());
    }
}
/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=64588:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit1.jisAlive.otherIsAliveTest.Run
CountOperate---begin
Thread.currentThread().getName()=main
Thread.currentThread.jisAlive()=true
this.getName=Thread-0
this.jisAlive=false
CountOperate---end
main begin t1 is alive=false
main end t1 jisAlive=true
run---begin
Thread.currentThread().getName()=A
Thread.currentThread.jisAlive()=true
this.getName=Thread-0
this.jisAlive=false
run---end

Process finished with exit code 0
 */
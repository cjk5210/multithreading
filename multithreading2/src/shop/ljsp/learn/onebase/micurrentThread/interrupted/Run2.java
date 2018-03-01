package shop.ljsp.learn.onebase.micurrentThread.interrupted;

public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？="+Thread.interrupted());
        System.out.println("是否停止2？="+Thread.interrupted());
//        System.out.println("是否停止1？="+Thread.interrupted());
//        System.out.println("是否停止1？="+Thread.currentThread().isInterrupted());

        System.out.println("end!");
    }
}

/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" -Dfile.encoding=UTF-8 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=56659:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.onebase.micurrentThread.interrupted.Run2
是否停止1？=true
是否停止1？=false
end!

Process finished with exit code 0
------------
interrupted() will clear the flag,reset to false.
 */

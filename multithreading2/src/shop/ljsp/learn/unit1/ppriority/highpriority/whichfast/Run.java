package shop.ljsp.learn.unit1.ppriority.highpriority.whichfast;

public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a=new ThreadA();
            a.setPriority(Thread.NORM_PRIORITY-3);
            a.start();
            ThreadB b=new ThreadB();
            b.setPriority(Thread.NORM_PRIORITY+3);
            b.start();
            Thread.sleep(20000);
            a.stop();
            b.stop();
            System.out.println("a="+a.getCount());
            System.out.println("b="+b.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=56278:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit1.ppriority.highpriority.whichfast.Run
a=54536819
b=142340298

Process finished with exit code 0
----------
ThreadB is faster than ThreadA.
 */

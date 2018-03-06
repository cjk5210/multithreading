package shop.ljsp.learn.unit1.micurrentThread.continueCurrentThread;

public class Run2 {
    public static void main(String[] args) {
        MyThread mythread=new MyThread();
        //mythread.start();
        mythread.run();
    }
}


/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=63973:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit1.micurrentThread.continueCurrentThread.Run2
构造方法的打印：main
run方法的打印：Thread-0

Process finished with exit code 0

 */
/*
if change Run2 to
public class Run2 {
    public static void main(String[] args) {
        MyThread mythread=new MyThread();
        //mythread.start();
        mythread.run();
    }
}
------------
the result is
------------
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=64170:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit1.micurrentThread.continueCurrentThread.Run2
构造方法的打印：main
run方法的打印：main
*** java.lang.instrument ASSERTION FAILED ***: "error == JVMTI_ERROR_NONE" at ../../../src/share/instrument/Reentrancy.c line: 80
*** java.lang.instrument ASSERTION FAILED ***: "test == expected" at ../../../src/share/instrument/Reentrancy.c line: 81
*** java.lang.instrument ASSERTION FAILED ***: "error == JVMTI_ERROR_NONE" at ../../../src/share/instrument/Reentrancy.c line: 80
*** java.lang.instrument ASSERTION FAILED ***: "test == expected" at ../../../src/share/instrument/Reentrancy.c line: 81
*** java.lang.instrument ASSERTION FAILED ***: "error == JVMTI_ERROR_NONE" at ../../../src/share/instrument/Reentrancy.c line: 80
*** java.lang.instrument ASSERTION FAILED ***: "test == expected" at ../../../src/share/instrument/Reentrancy.c line: 81
*** java.lang.instrument ASSERTION FAILED ***: "error == JVMTI_ERROR_NONE" at ../../../src/share/instrument/Reentrancy.c line: 139

Process finished with exit code 0

 */

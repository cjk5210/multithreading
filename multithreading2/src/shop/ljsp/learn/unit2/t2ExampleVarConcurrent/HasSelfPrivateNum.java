package shop.ljsp.learn.unit2.t2ExampleVarConcurrent;

public class HasSelfPrivateNum {
    private int num=0;

//    public void addI(String username){
    synchronized public void addI(String username){
        try {
            if(username.equals("a")){
                num=100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else{
                num=200;
                System.out.println("b set over!");
            }
            System.out.println(username+" num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
"C:\Program Files\Java\jdk1.6.0_23\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=55034:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.6.0_23\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jce.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\resources.jar;C:\Program Files\Java\jdk1.6.0_23\jre\lib\rt.jar;E:\tensor\multithreading\multithreading\multithreading2\web\WEB-INF\classes" shop.ljsp.learn.unit2.t2ExampleVarConcurrent.Run
a set over!
b set over!
b num=200
a num=200

Process finished with exit code 0
------------
如果 多个 线程 共同 访问 1 个 对象 中的 实例 变量， 则有 可能 出现“ 非 线程 安全” 问题。


 */
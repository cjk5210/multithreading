package shop.ljsp.learn.Test;

public class TestPath {
    public static void main(String[] args) {
        String a="D:\\Primeton\\Platform\\apache-tomcat-5.5.20\\webapps\\default\\/excel-config/";
        System.out.println(a.indexOf("D:\\"));
//        String b=a.replace("/","\\");
////                a.replace("\\\\","\\");
        System.out.println(a.replace("/","\\").replace("\\\\","\\"));
    }

}

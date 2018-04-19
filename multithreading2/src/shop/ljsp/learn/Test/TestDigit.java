package shop.ljsp.learn.Test;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class TestDigit {
    public static void main(String[] args) {
        String num="10B99999999999";


        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(num);
        matcher.find();
        String re=matcher.group(0);
        System.out.println(re);
        int a=new Scanner(num).useDelimiter("\\D+").nextInt();
        System.out.println("aaa="+a);
    }
}

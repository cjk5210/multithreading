package shop.ljsp.learn.Test;

import java.util.regex.Pattern;

public class TestReg {
    public static void main(String[] args) {
        String reg="\\d{4}-\\d{2}";

        String content = "1986-01";
        boolean isMatch = Pattern.matches(reg, content);
        System.out.println(isMatch);
    }
}

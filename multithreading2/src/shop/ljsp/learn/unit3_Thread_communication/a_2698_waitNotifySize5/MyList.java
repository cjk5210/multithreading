package shop.ljsp.learn.unit3_Thread_communication.a_2698_waitNotifySize5;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private static List list=new ArrayList();
    public static void add(){
        list.add("anyString");
    }
    public static int size(){
        return list.size();
    }
}

package shop.ljsp.learn.unit3_Thread_communication.c_3634_InheritableThredLocal1;

import java.util.Date;

public class InheritableThreadlocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}

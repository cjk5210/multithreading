package shop.ljsp.learn.unit3_Thread_communication.a_3223_pipeStream.pipeInputOutput;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;
    public ThreadWrite(WriteData write,PipedOutputStream out){
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}

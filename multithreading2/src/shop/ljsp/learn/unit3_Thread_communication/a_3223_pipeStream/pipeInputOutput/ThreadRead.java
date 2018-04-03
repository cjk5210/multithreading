package shop.ljsp.learn.unit3_Thread_communication.a_3223_pipeStream.pipeInputOutput;

import java.io.PipedInputStream;

public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        super();
        this.read=read;
        this.input=input;
    }

    @Override
    public void run() {
        read.readMehtod(input);
    }
}

package shop.ljsp.learn.unit1.nstopthread;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
/*
i=230511
i=230512
i=230513
i=230514
已经是停止状态！我要退出了！
end!

Process finished with exit code 0
-------------
上面 的 示例 虽然 停止 了 线程， 但 如果 for 语句 下面 还有 语句， 还是 会 继续 运行 的。


 */
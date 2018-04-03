package shop.ljsp.learn.unit3_Thread_communication.a_3307_waitNotifyInsertTest;

public class BackupA extends Thread {
    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        super();
        this.dbTools=dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}

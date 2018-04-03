package shop.ljsp.learn.unit3_Thread_communication.a_3307_waitNotifyInsertTest;

public class BackupB extends Thread {
    private DBTools dbTools;
    public BackupB(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}

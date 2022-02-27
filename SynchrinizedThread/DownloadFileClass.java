package SynchrinizedThread;

public class DownloadFileClass implements  Runnable{
    private  DownladStatus status;

    public DownloadFileClass(DownladStatus status) {
        this.status=status;
    }

    @Override
    public void run() {
       for(var i =0;i<10000;i++){
           status.incrementTotalByte();
       }
        System.out.println("download completed"
                +Thread.currentThread().getName());

    }

    public DownladStatus getStatus() {
        return status;
    }
}

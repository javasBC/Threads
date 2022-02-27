package SynchrinizedThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownladStatus {
    private int totalByte;
    private int totalFiles;
    private Lock gate = new ReentrantLock();

    public int getTotalFiles() {
        return totalFiles;
    }

    public int getTotalByte() {
        return totalByte;
    }
    public void incrementTotalByte(){
       synchronized (this) {
           this.totalByte++;// 3 steps under the hood}
       }

       //the first way
       //gate.lock();
       //try {
       //    this.totalByte++;
       //}
       //finally {
       //    gate.unlock();
       //}

    }

   // 3rd op
   //public synchronized void increment(){
   //    totalByte++;
   //}
}

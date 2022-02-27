package SynchrinizedThread;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show (){
        DownladStatus status = new DownladStatus();
        List<Thread> threads = new ArrayList<>();

        for(var i = 0; i< 10;i++){

            Thread thread = new Thread(new DownloadFileClass(status));
            thread.start();
            threads.add(thread);

        }
        for(var thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(status.getTotalByte());
    }

}

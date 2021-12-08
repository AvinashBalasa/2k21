package hackerEvents.uhg.fom;

import static java.lang.Thread.sleep;

public class SampleDemo implements Runnable{
    private Thread t;
    private String threadName;
    SampleDemo(String threadName){
        this.threadName=threadName;
    }
    public void run()
    {
        while(true)
            try {
                sleep(2250);
                System.out.print(threadName);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
    public void start()
    {
        if(t== null){
            t= new Thread(this,threadName);
            t.start();
        }
    }
}

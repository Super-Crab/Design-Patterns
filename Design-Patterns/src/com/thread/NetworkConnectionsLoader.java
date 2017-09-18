package com.thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class NetworkConnectionsLoader implements Runnable {


    /**
     * Main method of the class
     */
    @Override
    public void run() {
        // Writes a message
        System.out.printf("Begining network connections loading: %s\n",new Date());
        // Sleep six seconds
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Writes a message
        System.out.printf("Network connections loading has finished: %s\n",new Date());
    }
}

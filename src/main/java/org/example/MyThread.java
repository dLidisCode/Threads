package org.example;

public class MyThread extends Thread{

    public void run(){
        for (long j=0; j<100000; j++)
            for (long i=0; i<1000; i++) {
                double x = ((double)i);
                x = Math.sqrt(4.0/(1.0+x*x));
            }
        System.out.println(ThreadColor.ANSI_CYAN+"Hello world");

    }
}

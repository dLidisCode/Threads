package org.example;

public class Main {
    public static void main(String[] args){

        int numOfThreads=10;
        Thread[] myThreads1 = new Thread[numOfThreads];
        Thread[] myThreads2 = new Thread[numOfThreads];
        Thread[] myThreads3 = new Thread[numOfThreads];

        for(int i=0;i<numOfThreads;i++){
            // ΕΞΩΤΕΡΙΚΗ ΚΛΑΣΗ
            myThreads1[i]= new Thread(new MyThread());
            myThreads1[i].start();

            // ΕΣΩΤΕΡΙΚΗ ΚΛΑΣΗ
            myThreads2[i]= new Thread(new MyThread2());
            myThreads2[i].start();
        }




        // ΑΝΩΝΥΜΗ ΚΛΑΣΗ
        new Thread(){
            @Override
            public void run() {
                for (long j=0; j<100000; j++)
                    for (long i=0; i<1000; i++) {
                        double x = ((double)i);
                        x = Math.sqrt(4.0/(1.0+x*x));
                    }
                System.out.println(ThreadColor.ANSI_RED+"Hello world");
            }
        }.start();

    }
}
class MyThread2 extends Thread{
    public void run(){
        for (long j=0; j<100000; j++)
            for (long i=0; i<1000; i++) {
                double x = ((double)i);
                x = Math.sqrt(4.0/(1.0+x*x));
            }
        System.out.println(ThreadColor.ANSI_PURPLE+"Hello world");

    }
}

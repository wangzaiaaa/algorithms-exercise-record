import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    static class Thread1 implements Runnable{
        Object o;

        void setO(Object o){
            this.o = o;
        }
        @Override
        public void run() {
            for(int i = 1; i <= 26 ;i++){
                for(int j = 1; j <= 2;j ++){
                    System.out.print((i-1) * 2 + j);
                }
                synchronized (this){
                    notify();
                }
                synchronized (o){
                    try{
                        o.wait();
                    }catch (InterruptedException e){

                    }
                }

            }
        }
    }

    static class Thread2 implements Runnable{
        Object o;
        void setO(Object o){
            this.o = o;
        }
        @Override
        public void run() {
            for(int i = 0; i <= 25 ;i++){
                System.out.print((char)('A' + i) + " ");
                synchronized (this){
                    notify();
                }
                synchronized (o){
                    try{
                        o.wait();
                    }catch (InterruptedException e){

                    }
                }

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
       Thread1 thread1 = new Thread1();
       Thread2 thread2 = new Thread2();
       thread1.setO(thread2);
       thread2.setO(thread1);
       new Thread(thread1).start();
        TimeUnit.MILLISECONDS.sleep(10);
        new Thread(thread2).start();
        TimeUnit.SECONDS.sleep(1);
        synchronized (thread1){
            thread1.notify();
        }

    }
}

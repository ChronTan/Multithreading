package domain;

public class JThread implements Runnable {

    public void run(){

        int z=0;
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
            for(int i=0;i<10;i++){
                z+=i;
            }
            System.out.println(z);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}

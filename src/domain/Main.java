package domain;

public class Main {

    public static void main(String[] args) {
        System.out.println("start Main");
        Thread t=new Thread(new JThread(), "JThread");
        t.start();
        try{
            t.join();
        }catch (InterruptedException e){
            System.out.println(t.getName());
        }
        System.out.println("finish Main");
    }
}

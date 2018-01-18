package day59;

public class Demo {
    public static void main(String[] args){
        Printer printer=new Printer();
        Thread t1=new Thread(new User(printer,"doc",10));
        Thread t2=new Thread(new User(printer,"img",10));
        Thread t3=new Thread(new User(printer,"ppt",10));
        t1.start();
        t2.start();
        t3.start();
    }
}

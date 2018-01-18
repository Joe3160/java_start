package day58;

public class Demo {
    public static void main(String[] args){
        Printer printer=new Printer();
        User user=new User(printer,"doc",10);
        User user1=new User(printer,"img",5);
        User user2=new User(printer,"ppt",8);

        Thread t1=new Thread(user);
        Thread t2=new Thread(user1);
        Thread t3=new Thread(user2);

        t1.start();
        t2.start();
        t3.start();

    }
}

package day55;

public class Demo {
    public static void main(String[] args) {
        Foo foo=new Foo();
        Thread thread=new Thread(foo);
        thread.start();
        for (int i = 0; i <100 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程："+i);
        }
    }
}

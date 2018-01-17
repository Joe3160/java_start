package day54;

public class Test {
    public static void main(String[] args) {
        Demo demo1=new Demo("线程1");
        //demo.run();//单线程
        demo1.start();//多线程
        Demo demo2=new Demo("线程2");
        demo2.start();
        for (int i=0;i<=100;i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程："+i);
        }
        System.out.println("程序执行完毕");
    }
}

package day59;

public class Foo {
    public synchronized void show1(){
        System.out.println("进入show1方法，获得锁");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("show1执行完毕，释放锁");
    }

    public synchronized void show2(){
        System.out.println("进入show2方法，获得锁");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("show2执行完毕，释放锁");
    }
}

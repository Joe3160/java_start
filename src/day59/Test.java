package day59;

public class Test {
    public static void main(String[] args){
        //多个线程调用同一个资源（对象）
        Foo source=new Foo();
        Thread t1=new Thread(new FooTest("show1",source));
        Thread t2=new Thread(new FooTest("show2",source));
        t1.start();
        t2.start();

    }
}

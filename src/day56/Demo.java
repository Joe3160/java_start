package day56;

public class Demo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Bar bar = new Bar();
        Thread t1 = new Thread(foo);
        Thread t2 = new Thread(bar);

        System.out.println("t1 的优先级："+t1.getPriority());
        System.out.println("t2 的优先级："+t2.getPriority());
        System.out.println("-------------------");

        //给t1设置最高的优先级
        t1.setPriority(10);
        //t1.setPriority(Thread.MAX_PRIORITY);//Thread.MAX_PRIORITY=10
        System.out.println("t1 的优先级："+t1.getPriority());
        System.out.println("t2 的优先级："+t2.getPriority());

        t1.start();//就绪状态
        t2.start();//就绪状态
    }
}

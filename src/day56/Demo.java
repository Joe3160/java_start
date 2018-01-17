package day56;

public class Demo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Bar bar = new Bar();
        Thread thread1 = new Thread(foo);
        Thread thread2 = new Thread(bar);
        thread1.start();//就绪状态
        thread2.start();//就绪状态
    }
}

package day60;

public class Demo {
    public static void main(String[] args) {
        Resource src1 = new Resource("src1");
        Resource src2 = new Resource("src2");
        Resource src3 = new Resource("src3");

        Foo t1 = new Foo(src1, src2, "线程1");//t1抢到src1，等待src2
        Foo t2 = new Foo(src2, src1, "线程2");//t2抢到src2，等待src3
        Foo t3 = new Foo(src3, src1, "线程3");//t3抢到src3，等待src1

        t1.start();
        t2.start();
        t3.start();




    }
}

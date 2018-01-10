package day42;

public class Demo {
    public static void main(String[] args) {
        Outer outer=new Outer();
        final int i=10;
        InnerInterface inner=outer.foo();
        String name=inner.say();
        System.out.println(name);

    }
}

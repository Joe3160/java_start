package day44;

public class Test{
    public static void main(String[] args) {
        Foo foo=new Foo();//先实例化外部类
        Bar bar=new Bar(foo);
        bar.say();
    }

}


/**
 * Bar 继承了Foo的一个内部类Son
 * 内部类的继承
 */
class Bar extends Foo.Son {
    //先实例化部类
    Bar(Foo foo){
        foo.super();
    }
}

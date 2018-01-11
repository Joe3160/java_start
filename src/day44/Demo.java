package day44;

public class Demo {
    public static void main(String[] args) {
        Outer outer=new Outer();//创建内部类之前，先创建外部类
        Outer.Inner inner=outer.new Inner();//外部类引用内部类
        inner.show(30);
    }
}

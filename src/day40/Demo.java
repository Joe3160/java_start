package day40;

public class Demo {
    public static void main(String[] args){
        Outer outer=new Outer();
        outer.showInner();
        System.out.println("--------------------");
        Outer.Inner inner=outer.new Inner();//直接实例化内部类
        inner.say();
        
    }
}

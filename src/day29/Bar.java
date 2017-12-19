package day29;

/**
 * final修饰符
 *
 */
public class Bar {
    //1、final 修饰变量
    //属性不可变，变量名建议全大写（类似常量）
    public final static String NAME="Bar";
    
    //2、final修饰方法，
    //任何继承类都无法覆盖该方法
    //重载不受限制
    public final static void hi(){
        System.out.println("Hello wrold");
    }
    
}

class Foo extends Bar{
    public Foo(){
        System.out.println("初始化Foo对象");
        
    }
    //报错，不能重写hi方法
    //public  static void hi(){
    //
    //}
}

/**
 * final修饰类
 * 该类不能做任何类的父类，
 * 类中所有方法自动被定义为final类型
 */

final class MyClass{

}

//报错，不能被继承
//class SubClass extends MyClass{
//
//}

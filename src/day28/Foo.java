package day28;

public class Foo {
    int id;
    static String name;
    
    
    
    public Foo(int id){
        this.id=id;
    }
    
    /**
     * 静态方法
     * 用static修饰的方法称为静态方法，通过 类名.方法名() 访问
     *1、静态方法不能访问非静态变量
     *2、非静态方法可以访问静态变量
     * 静态属性或方法是类加载时候产生的
     * 非静态属性或方法在new时候产生的
     */
    public static void hi(){
        System.out.println("Hello world");
    }
    
    
}

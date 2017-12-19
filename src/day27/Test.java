package day27;

/**
 * Java中只有值传递
 * 基本数据类型做为参数，直接使用
 * 引用类型做为参数，操作的是指向的堆内存中的对象
 */
public class Test {
    public static void main(String[] args){
        Demo demo=new Demo("Joe",6666);
        print(demo);
        System.out.println(demo.id);//8888?6666?
    
        System.out.println("-------------------------");
        
        int a=200;
        print(a);//100
        System.out.println(a);// 100? 200?
        
    }
    
    public static void print(Demo demo){
        System.out.println("id:"+demo.id);
        System.out.println("name:"+demo.name);
        demo.hi();
        demo.id=8888;
    }
    
    public static void print(int a){
        System.out.println(a);
        a=100;
    }
}

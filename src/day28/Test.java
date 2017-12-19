package day28;
public class Test {
    public static void main(String[] args){
        Foo foo=new Foo(100);
        Foo foo1=new Foo(200);
    
        System.out.println("foo.id="+foo.id);//100
        System.out.println("foo1.id="+foo1.id);//200
    
        System.out.println("--------------");
        foo.name="Joe";
        System.out.println("foo.name="+foo.name);
        System.out.println("foo1.name="+foo1.name);
    
        System.out.println("--------------");
        foo1.name="Marry";
        System.out.println("foo.name="+foo.name);
        System.out.println("foo1.name="+foo1.name);
        
        
        //静态变量通过 类名.变量名 形式来访问
        Foo.name="Tom";
        System.out.println("---------------");
        Bar bar1=new Bar(100);
        Bar bar2=new Bar(200);
        Bar bar3=new Bar(300);
        System.out.println("bar1.id="+bar1.id);
        System.out.println("bar2.id="+bar2.id);
        System.out.println("bar3.id="+bar3.id);
        System.out.println("Bar.num="+Bar.num);
        
        
        
    }
}

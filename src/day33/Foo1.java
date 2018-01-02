package day33;

public class Foo1 {
    Foo1(){
        System.out.println("调用Fool1无参构造方法");
    }
    
    Foo1(int i){
        System.out.println("调用Fool1有参构造方法");
    }
}


class Fool2 extends Foo1{
    Fool2(){
        System.out.println("调用Fool2无参构造方法");
    }
    
    Fool2(int i){
        super(i);
        System.out.println("调用Fool2有参构造方法");
    }
}

class Fool3 extends Fool2{
    //super()必须放在方法的第一行
    Fool3(){
        //super();//调用父类无参构造器（隐藏），如缺省则自动加上
        System.out.println("调用Fool3无参构造方法");
    }
    
    Fool3(int i){
        super(i);//显式调用父类有参构造器
        System.out.println("调用Fool3有参构造方法");
    }
}



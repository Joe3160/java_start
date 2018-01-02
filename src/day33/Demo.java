package day33;

import common.helper;

public class Demo {
    public static void main(String[] args) {
        Fool3 Fool3=new Fool3();
        helper.dump("---------------------------");
    
        System.out.println("调用有参的构造器，则需要显示加上，编译器不会自动加上");
        Fool3 fool=new Fool3(10);
        
    }
}

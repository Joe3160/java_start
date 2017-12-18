package day25;

import common.helper;

public class Test {
    public static void main(String[] args) {
        Demo demo;//1、声明一个对象的类型
        demo = new Demo();//2、开辟内存空间
        
        // 1和2合成一个步骤
        User user=new User();
        user.email="694995669@qq.com";
        user.mobile="13512783986";
        user.username="Joe";
    
        helper.dump(user.username);
        helper.dump(user.email);
        helper.dump(user.mobile);
        
        
        
        
    }
}

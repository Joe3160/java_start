package day23;

import common.helper;

public class Test {
    public static void main(String[] args) {
        //无参的构造方法
        //User user=new User();
        //helper.dump(user.age);
        //有参的构造方法
        User user=new User("Joe","male",29);
        helper.dump(user.age);
        
        User user1=new User("Lily","female");
        helper.dump(user1.name);


    }
}

package day36;

import common.helper;

public class Demo {
    public static void main(String[] args) {
        User user=new User();
        String name=user.getUserName();
        helper.dump(name);
        System.out.println("------------");
        user.test();
    }
}

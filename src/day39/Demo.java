package day39;

import common.helper;

public class Demo {
    public static void main(String[] args) {
        User user = new User();
        user.show1();
        user.show2();
        user.show3();
        user.show4();
        user.show5();
        
        String aa99 = "00";
        if (aa99.equals("00")) {
            System.out.println("55a555");
            System.out.println("a123456789");
            System.out.println("55555");
        } else {
            System.out.println("888");
        }
        
        
        User2Interface user2Interface = user;
        user2Interface.show6();
        helper.dump("ddd");
        
    }
}

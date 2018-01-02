package day31;

import common.helper;

public class Test {
    public static void main(String[] args) {
        User user=new User();
        user.setName("Joe");
        String name=user.getName();
        helper.dump(name);
    
        System.out.println("---------------");
        
        Time time=new Time();
        
        int h=26;
        time.setHour(h);
        if (time.getHour() == -1) {
            helper.dump(time.getHour());
        } else {
            helper.dump("输入有误");
        }
        
        
        
    }
}

package day21;

public class Test {
    public static void main(String[] args){
        User user=new User();//实例化类
        String hi=user.hi();
        System.out.println(hi);
        user.hello("Joe");
    }
}

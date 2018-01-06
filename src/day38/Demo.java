package day38;

public class Demo {
    public static  void main(String[] args){
        User user=new User();
        user.setName("Joe");
        String name=user.getName();
        System.out.println(name);
        
        System.out.println("--------------------");
    
        System.out.println(User2Interface.id);
        System.out.println(UserInterface.id);
        
        //System.out.println(user.id);//类实例变量
        //System.out.println(User.id);//类的静态变量 public static final id=10;
       
    }
}

package day26;

public class Test {
    public static void main(String[] args){
        User user,user1,user2,user3,user4;
        user=new User();
        user1=new User("Joe");
        print(user);
        user2=new User("Tom",66771);
        print(user2);
        user3=new User("Marry",66782,"13512783986");
        print(user3);
        user4=new User("Bill",600029,"18576722468","694995669@qq.com");
        print(user4);
    }
    
    public static void print(User user){
        System.out.println("name:"+user.name);
        System.out.println("id:"+user.id);
        System.out.println("mobile:"+user.mobile);
        System.out.println("email:"+user.email);
        System.out.println("-------------");
    }
}

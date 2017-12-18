package day26;

public class User {
    String name;
    int id;
    String mobile;
    String email;
    
    public User() {
        super();//调用父类构造器
    
    }
    
    public User(String name) {
        this.name = name;
    }
    
    public User(String name, int id) {
        this(name);//直接调用上面的构造方法
        this.id = id;
    }
    
    public User(String name, int id, String mobile){
        this(name,id);//直接调用上面的构造方法
        this.mobile=mobile;
    }
    
    public User(String name, int id, String mobile, String email) {
        this(name,id,mobile);//直接调用上面的构造方法
        this.email = email;
    }
    
    
}

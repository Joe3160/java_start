package day23;

public class User {
    String name;
    String gender;
    int age;

    /**
     * 无参的构造方法
     * 方法名跟类名相同,没有返回值，不能用void修饰
     */
    /*
     User(){//构造方法，
            name=null;
            gender=null;
            age=10;
        }
    */

    /**
     * 有参的构造方法
     * this 类对象本身
     */
    User(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    
    /**
     * 多个构造方法
     * @param name
     * @param gender
     */
    User(String name,String gender){
        this.name=name;
        this.gender=gender;
    }
}

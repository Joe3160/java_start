package day21;

public class User {
    private String userName;
    private String gender;
    private int age;

    //1修饰符:
    //private:只有本可见
    //protected:本类、同一个包可见
    //public：公开，对全部类可见
    //默认：本类、同一个包可见

    //2返回类型，有(具体类型)，无（void）

    public String hi(){
        return "hello world";
    }

    /*
    修饰符 返回类型 方法名(参数类型 参数1,参数类型 参数1,...){
        方法体
    }
    */
    public void hello(String name){
        System.out.println("Hello "+name);
    }


}

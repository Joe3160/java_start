package day51;

public class Demo {
    public static void main(String[] args){
        System.out.println("----------");
        MyException e=new MyException("ddd");
        System.out.println(e.getMessage());
        System.out.println(e.toString());

    }
}

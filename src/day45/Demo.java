package day45;

public class Demo {
    public static void main(String[] args){
        //double a=1/0.0;//无限大
        ////double b=1/0; //抛出异常
        ////System.out.println(b);
        //System.out.println(a);
        try {
            System.out.println(1/0);
            System.out.println("66666666");
        }catch (ArithmeticException e){// Exception所有的异常,ArithmeticException运算异常
            System.out.println("catch用于捕获到运算异常");
            e.printStackTrace();
        }finally {
            System.out.println("finally用于执行一些收尾工作");
        }

    }
}

package day48;

public class Demo {

    public static void main(String[] args) {
        System.out.println("main开始");
        try {
            Demo demo = new Demo();
            //demo.test();
            demo.test1();
        } catch (ArithmeticException e) {
            System.out.println("发生异常："+e.getMessage());
        }
        System.out.println("main结束");
    }

    /**
     * 在方法中声明一个异常
     *
     * @throws ArithmeticException
     */
    public void test() throws ArithmeticException {
        System.out.println("test开始执行");
        System.out.println(1 / 0);
        System.out.println("test执行完毕");
    }

    public void test1() throws ArithmeticException{
        test();
    }

    public void test2(){
        test1();
    }
}

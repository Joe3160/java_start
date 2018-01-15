package day47;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        try {
            int temp = a / 0;
            System.out.println("上面没有异常");
        } catch (ArithmeticException e) {
            System.out.println("发生算术运算错误");
            //return;//仍会执行finally代码块
            //System.exit(0);//不再执行finally代码块
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("发生数组越界错误");
        } catch (Exception e) {
            System.out.println("发生异常："+e.getStackTrace());
        } finally {
            System.out.println("finally");
        }

        System.out.println("程序运行结束");
    }
}

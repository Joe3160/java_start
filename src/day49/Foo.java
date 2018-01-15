package day49;

public class Foo {
    public static void main(String[] args){
        double a=Math.random();
        System.out.println(a);

        try {
            if (a < 0.5) {
                System.out.println("a=" + a + ",It is OK!");
            } else {
                throw new Exception("数据太大了！");
            }
        } catch (Exception e) {
            System.out.println("这是外层捕获的异常:"+e);
            try {
                double b = 1 / 0;
            } catch (Exception e1) {
                System.out.println("这是外层捕获的异常:"+e1);
            }
        }

    }
}

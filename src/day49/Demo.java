package day49;

public class Demo {
    public static void main(String[] args) {
        Demo demo=new Demo();
        try {
            demo.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test() throws Exception{
        throw new Exception("这是一个异常");
    }
}

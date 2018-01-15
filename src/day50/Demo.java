package day50;

public class Demo {
    public static void main(String[] args) {
        Test test=new Test();
        try {
            test.test(10,0);
        } catch (FooException e) {
            e.printStackTrace();
            System.out.println("错误原因:"+e);
        }
    }
}




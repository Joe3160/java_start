package day52;

public class Demo {
    public static void main(String[] args) {
        try {
            int i=100/0;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("这是收尾工作");
        }

    }
}

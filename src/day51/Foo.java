package day51;

public class Foo {
    public static void main(String[] args) {
        int age = 20;
        try {
            String status = test(age);
            System.out.println(age);
            System.out.println(status);
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    public static String test(int age) throws MyException {
        if (age <= 0 || age > 120) {
            throw new MyException("输入有误！！！");
        } else if (age < 18) {
            return "少年";
        } else if (age <= 30) {
            return "青年";
        } else if (age <= 60) {
            return "中年";
        } else {
            return "老年";
        }
    }
}

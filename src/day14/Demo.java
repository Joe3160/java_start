package day14;

/**
 * 关系运算符，逻辑运算符，三元运算符，运算符优先级
 */
public class Demo {
    public static void main(String[] args) {
        //1、关系运算符
        int a = 3;
        int b = 5;
        boolean b1, b2, b3, b4;
        b1 = a == b;
        b2 = a != b;
        b3 = a > b;
        b4 = a < b;
        System.out.println(b1);//false
        System.out.println(b2);//true
        System.out.println(b3);//false
        System.out.println(b4);//true

        System.out.println("-----------------");

        //2、逻辑运算符
        // 逻辑与&，
        // 逻辑或|
        // 逻辑非!，
        // 短路与&&，
        // 短路或||，
        boolean b5, b6, b7, b8, b9;
        System.out.println("逻辑与运算:ret_false()&ret_true():");
        b5 = ret_false() & ret_true();
        System.out.println("result:" + b5);//false
        System.out.println("短路与运算 ret_false() && ret_true():");
        b6 = ret_false() && ret_true();
        System.out.println("result:" + b6);//false

        System.out.println("------------------");
        System.out.println("逻辑或运算符ret_true()|ret_false():");
        b7 = ret_true() | ret_false();
        System.out.println(b7);
        System.out.println("短路或：ret_true()||ret_false()");
        b8 = ret_true() || ret_false();
        System.out.println(b8);

        System.out.println("-------------三元运算符--------------");

        //3、三元运算符
        int score = 50;
        String result;
        System.out.print("分数："+score+" 结果：");
        result = score >= 60 ? "及格" : "不及格";
        System.out.println(result);

        System.out.println("-------------------------------");

        //4、运算符的优先级
        int i,j=100;
        i=j++;
        System.out.println(i);



    }

    public static boolean ret_true() {
        System.out.println("I am true");
        return true;
    }

    public static boolean ret_false() {
        System.out.println("I am false");
        return false;
    }


}

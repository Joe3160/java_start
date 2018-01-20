import java.util.Random;

public class TestRand {
    public static void main(String[] args) {
        //不带种子
        System.out.println("-------------不带种子----------------");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(100));
        }
        System.out.println("参考数据----------------------");
        Random random2 = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random2.nextInt(100));
        }

        System.out.println("-------------------带种子---------------------");
        Random random3 = new Random(555L);
        for (int i = 0; i < 20; i++) {
            System.out.println(random3.nextInt(100));
        }
        System.out.println("参考数据1----------------------");
        Random random4 = new Random(555L);
        for (int i = 0; i < 10; i++) {
            System.out.println(random4.nextInt(100));
        }
        System.out.println("参考数据2----------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(random4.nextInt(100));
        }

        System.out.println("--------------Math------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
        System.out.println("参考数据----------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }


    }
}

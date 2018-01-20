import java.util.Random;


public class TestRandomNum {
    public static void main(String[] args) {
        randomTest();
        testNoSeed();
        testSeed1();
        testSeed2();
    }

    public static void randomTest() {
        System.out.println("--------------test()--------------");
        //返回以毫秒为单位的当前时间。
        long r1 = System.currentTimeMillis();
        //返回带正号的 double 值，大于或等于 0.0，小于 1.0。
        double r2 = Math.random();
        //通过Random类来获取下一个随机的整数
        int r3 = new Random().nextInt();
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
    }

    public static void testNoSeed() {
        System.out.println("--------------testNoSeed()--------------");
        //创建不带种子的测试Random对象
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
        System.out.println("----------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
    }

    public static void testSeed1() {
        System.out.println("--------------testSeed1()--------------");
        //创建带种子的测试Random对象
        Random random = new Random(555L);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
    }

    public static void testSeed2() {
        System.out.println("--------------testSeed2()--------------");
        //创建带种子的测试Random对象
        Random random = new Random();
        random.setSeed(555L);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
    }
}
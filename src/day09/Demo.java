package day09;

public class Demo {

    //类变量
    static boolean a_bool;//false
    static char a_char;// \000
    static byte a_byte; // 0(byte) 00000000
    static short a_short;//0(short) 00000000 00000000
    static int a_int;//0(int) 00000000 00000000 00000000 00000000
    static long a_long; // oL
    static float a_float;// 0.0f
    static double a_double;//0.0d
    //实例变量




    public static void main(String[] args) {
        //声明变量
        int speed,salary;
        float time,base,prize,distance;
        char alpha;
        //给变量赋值
        alpha='a';
        prize=2000;
        base=4000.40f;//浮点类型默认为double，如果要定义float的话，要加f;
        System.out.println(base);
        speed=100;
        time=40.2f;
        //通过表达式赋值
        salary=(int)(base+prize);
        System.out.println(salary);
        distance=speed*time;
        System.out.println(distance);

        System.out.println("-------------------------");


        /**
         * 始初化
         * 局部变量必须显式的初始化
         * 实例变量和类变量编译器会自动初始化
         */
        int num;
        //System.out.println(num);//未初始化，报错

        //声明类变量与实例变量
        System.out.println("a_bool="+a_bool);
        System.out.println("a_char="+a_char);
        System.out.println("a_short="+a_short);
        System.out.println("a_int="+a_int);
        System.out.println("a_float="+a_float);
        System.out.println("a_long="+a_long);
        System.out.println("a_double="+a_double);









    }
}

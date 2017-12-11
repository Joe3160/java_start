package day13;

/***
 * 赋值运算符
 */
public class Demo {
    public static  void main(String[] args){
        //赋值运算符
        int i2=1;
        i2+=5;
        System.out.println(i2);//6
        i2-=2;
        System.out.println(i2);//4
        i2*=2;
        System.out.println(i2);//8
        i2/=3;
        System.out.println(i2);//2
        i2%=2;
        System.out.println(i2);//0

        System.out.println("------------------自增、自减--------------------");
        //自增
        System.out.println("--------自增-------------");
        int i3 =20;
        System.out.println("i3="+i3);//20
        System.out.println("++i3="+(++i3));//21
        System.out.println("i3="+i3);//21
        System.out.println("i3++="+(i3++));//21
        System.out.println("i3="+i3);//22

        //自减
        System.out.println("--------自减-------------");
        int i4=40;
        System.out.println("i4="+i4);//40
        System.out.println("--i4="+(--i4));//39
        System.out.println("i4="+i4);//39
        System.out.println("i4--="+(i4--));//39
        System.out.println("i4="+i4);//38







    }
}

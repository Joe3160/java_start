package day11;

public class Demo {
    public static  void main(String[] args){
        //1、字符串截取
        String str1="Hello World";
        System.out.println(str1);
        String str1_sub1=str1.substring(6); //6-end
        System.out.println("6-end："+str1_sub1);
        String str1_sub2=str1.substring(1,2);//前闭后开 1<=x<2
        System.out.println("1-2："+str1_sub2);
        System.out.println("------------------------");
        //2、字符串是否相等
        // Object.equals 等价== 比较对象的内存地址
        // String.equals 对较字符串内容是否相同

        //维护在常量池
        String s1="Hello";
        String s2="Hello";
        String s3="hello"+"world";

        System.out.println(s1.equals(s2));//比较内容，true
        System.out.println(s1==s2);//比较内地址，false
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);

        int a=1;
        int b=1;
        System.out.println(a==b);

        //new 出来的都是新对象
        String s4=new String("Hello");//实例对象
        String s5=new String("Hello");


        System.out.println(s1==s5 );
        System.out.println(s4==s5);

        boolean s6=false;
        boolean s7=false;
        System.out.println(s6==s7);

        //3、字符串编辑

    }
}

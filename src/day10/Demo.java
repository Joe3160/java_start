package day10;

public class Demo {
    public static void main(String[] args){
        String str="Hello World";
        System.out.println(str);

        String str2;
        str2="Hello Joe";
        System.out.println(str2);

        //可用+连接两个字符串
        String str3=str+" & "+str2;
        System.out.println(str3);

        //  \n 换行符  另起一行，光标移到下一行开始处
        //  \t 制表符
        //  \r 回车符  把光标移到本行开始处
        //  \' 单引号
        //  \" 双引号
        //  \\  反斜枉 \


        String str1="Hello\nWorld";
        System.out.println(str1);
        System.out.println(str1.length());//11
        System.out.println("你好".length());//2



    }
}

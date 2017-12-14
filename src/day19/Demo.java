package day19;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        int[] arr1=new int[15];
        System.out.println(arr1.length);
        int i;
        double sum=0,avg=0;
        double[] user=new double[10];
        //创建一个scanner对象，用它来获得用户的输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输前10名成绩：");
        for (i=0;i<user.length;i++) {
            System.out.println("请输入第"+(i+1)+"个成绩：");
            user[i]=sc.nextDouble();//获得用户输入信息
            sum+=user[i];
            System.out.println("当前累计总成绩："+sum);
        }

        avg=sum/user.length;
        System.out.println("平均成绩："+avg);
    }
}

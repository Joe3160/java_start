package day16;

/**
 * 流程控制之 循环结构
 */
public class Demo {
    public static void main(String[] args){
        //while循环
        int i=0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("---------------");
        //do……while循环
        int j=20;
        do {
            System.out.println(j);
            j++;
        } while (j<=10);

        System.out.println("---for--------");
        //for(初始条件;条件;迭代运算)  {循环体}
        //条件：boolean表达式，条件为真，执行循环体；为假，跳出循环

        int ride=10;
        int result=1;
        for (i=1;i<=ride;i++) {
            result*=i;
            System.out.println(i+":"+result);
        }
        System.out.println(ride+"的阶乘是："+result);

        System.out.println("--------------------------");
        //多个循环控制变量
        for (int a=1,b;a<20;a++) {
            b=a*a;
            System.out.println(a+"的平方是"+b);
        }

    }
}

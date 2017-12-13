package day17;

/**
 * 流程控制之 break，continue，return
 */
public class Demo {
    public static void main(String[] args){
        System.out.println("-----------break----------");
        for (int i=1;i<10;i++){
            if (i == 4) {
                System.out.println("i="+i+"循环中止，剩余循环不执行");
                break;
            }
            System.out.println(i);
        }

        System.out.println("---------continue----------------");
        for (int j=1;j<=10;j++){
            if (j==5){
                System.out.println("j="+j+"时，跳过当循环，执行剩余循环");
                continue;
            }
            System.out.println(j);
        }

        System.out.println("----------------return从当前方法退出----------------------");
        for (int k=1;k<10;k++){
            if (k==6){
                return;
            }
            System.out.println(k);
        }
        //上有个return 往下不执行了
        System.out.println("Hello world");

    }
}

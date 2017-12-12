package day15;

/***
 * 流程控制之选择结构
 */
public class Demo {
    public static void main(String[] args){

        // if 阶梯形式
        int a=0,b=10;

        //boolean类型的值
        if (a < b) {
            System.out.println("a<b");
        } else if (a == b) {
            System.out.println("a==b");
        } else {
            System.out.println("a>b");
        }

        //boolean类型的变量
        boolean flag=true;
        if (flag) {
            System.out.println("flag 为true");
        } else {
            System.out.println("flag 为false");
        }
        //boolean类型的返回值
        if (flag_false()) {
            System.out.println("返回值为true");
        } else {
            System.out.println("返回值为false");
        }



        //switch 语法
        //switch 变量类型
        //byte,int,char, byte, short, int, Character, Byte, Short, Integer, String(java 7+),enum
        //case 变量类型 与 switch 变量类型一致
        //case 变量类型不可重复
        int day=4;
        switch (day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("日期有误");
                break;

        }
    }

    public static boolean flag_true() {
        return true;
    }

    public static boolean flag_false() {
        return false;
    }
}

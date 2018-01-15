package day46;

public class Demo {
    public static void main(String[] args) {
        //类型转换异常
        //User user=new User();
        //Bar bar=(Bar) user;

        //正常
        Bar bar = new Bar();
        User user = (User) bar;


        //空指针异常
        //user=null;
        //user.show();

        //数据越界异常
        //int[] arr = new int[]{1, 2, 3};
        //System.out.println(arr[3]);


    }
}

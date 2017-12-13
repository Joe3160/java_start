package day18;

public class Demo {
    public static void main(String[] args) {
        //定义数组：
        //1、 数组类型  变量名[]
        //2、 数组类型[] 变量名
        double arr1[];
        double[] arr2;
        double[] arr3, arr4;

        //分配内存空间
        arr1 = new double[4];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        //访问数组的元素
        System.out.println(arr1[2]);

        System.out.println("------------------------");
        //创建不同数组
        byte[] arr_byte = new byte[1];
        char[] arr_char = new char[1];
        int[] arr_int = new int[1];
        long[] arr_long = new long[1];
        float[] arr_float = new float[1];
        double[] arr_double = new double[1];
        String[] arr_string = new String[1];
        boolean[] arr_bool = new boolean[1];
        //打印初始化值
        System.out.println("byte默认值：" + arr_byte[0]);
        System.out.println("char默认值：" + arr_char[0]);
        System.out.println("int默认值：" + arr_int[0]);
        System.out.println("long默认值：" + arr_long[0]);
        System.out.println("float默认值：" + arr_float[0]);
        System.out.println("double默认值：" + arr_double[0]);
        System.out.println("string默认值：" + arr_string[0]);
        System.out.println("bool默认值：" + arr_bool[0]);

        System.out.println("-------------------------------------");
        int[] arr5=new int[3];
        arr5[0]=2;
        arr5[1]=4;
        arr5[2]=6;
        System.out.println(arr5[0]);

        System.out.println("-------第二种初始化方式------------");
        //第二种初始化方式
        int[] arr6={1,3,5,7};
        System.out.println(arr6[2]);

        System.out.println("-----------------");
        int[] arr7=new int[3];
        int[] arr8={1,3,5,7,9};
        for (int i=0;i<arr8.length;i++){
            System.out.println(arr8[i]);
        }


    }
}

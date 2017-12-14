package day19;
import common.helper;
public class ArrDemo {
    public static void main(String[] args){
        int[] arr1={1,3,5};
        int[] arr2={2,4,6};

        System.out.printf("arr1初始值：");
        helper.dump(arr1);
        System.out.println("arr2初始值");
        helper.dump(arr2);

        arr1=arr2;//arr2的引用赋给arr1
        helper.dump(arr1);

        System.out.println("--------------------");
        arr1[0]=10;
        arr2[1]=100;
        helper.dump(arr1);
        helper.dump(arr2);
    }



}

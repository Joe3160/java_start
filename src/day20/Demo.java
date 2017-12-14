package day20;

import common.helper;

public class Demo {
    public static void main(String[] args) {

        //声明二维数组
        int[][] arr1 = new int[2][3];
        int[][] arr2 = {{1, 3, 5}, {2, 4, 6}};

        //不规则数组
        //第一种：
        int[][] arr3 = {
                {1, 3, 5},
                {2, 4, 6, 8},
                {3, 6, 9, 12, 15},
        };
        //第二种:
        int[][] arr4 = new int[2][];
        arr4[0] = new int[3];
        arr4[1] = new int[2];
        arr4[0][0] = 1;
        arr4[0][1] = 2;
        arr4[0][2] = 3;
        arr4[1][0] = 11;
        arr4[1][1] = 22;

        //helper.dump(arr4[0]);
        //helper.dump(arr4[1]);

        helper.dump(arr4);


    }
}

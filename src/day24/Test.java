package day24;

import common.helper;

public class Test {
    public static void main(String[] args){
        int sum1=Tools.sum(20,30);
        helper.dump(sum1);
        
        double sum2=Tools.sum(3.4,6.7);
        helper.dump(sum2);
        
        double sum3=Tools.sum(3.2,8);
        helper.dump(sum3);
        
        int sum4=Tools.sum(1,2,3);
        helper.dump(sum4);
    
        Tools.test(123,"hi");
        Tools.test("Hi",123);
        
        
    }

}

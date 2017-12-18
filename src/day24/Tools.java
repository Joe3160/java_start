package day24;
/**
 * 方法的重载
 *  具有相同的方法名称，不同的参数列表
 *  参数列表：参数类型，次序，数量
 */
public class Tools {
    public static int sum(int a,int b){
        return a+b;
    }
    
    /**
     *
     * @param a double 兼容int 所以可以用Tools.sum(4.2,5)来使用
     * @param b
     * @return
     */
    public static double sum(double a,double b){
        return a+b;
    }
    
    public static  int sum(int a,int b,int c){
        return  a+b+c;
    }
    
    public static void test(int a,String b){
        System.out.println("This is Test1");
    }
    
    public static void test(String a,int b){
        System.out.println("This is Test2");
    }
}

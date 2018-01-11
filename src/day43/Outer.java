package day43;

public class Outer {
    private static int i=100;
    static class Inner{
        public void show(){
            System.out.println(i);
            System.out.println("Inner show");
        }
    }
}

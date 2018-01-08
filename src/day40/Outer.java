package day40;

public class Outer {
    private String name="outer";
    
    public void showInner(){
        Inner inner=new Inner();
        inner.say();
        
    }
    
    //定义内部类
    class Inner{
        public void say(){
            System.out.println("This is a inner class");
            System.out.println(name);
        }
    }
}

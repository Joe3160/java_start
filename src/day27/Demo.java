package day27;

/**
 * Java中只有值传递
 */
public class Demo {
    String name;
    int id;
    
    public Demo(String name,int id){
        this.name=name;
        this.id=id;
    }
    
    public static void hi(){
        System.out.println("Hello");
    }
    

}

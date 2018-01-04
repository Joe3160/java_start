package day34;

public class Dog extends Pet {
    private String strain="dog";//品种

    
    public void setName(){
        System.out.println("*******");
        super.setName(this.strain);//super调用父类方法
    }
    
    public String getName(){
        this.setName();//this先尝试调用本类的方法，找不到则调用父类的方法
        return super.getName();
    }

    

}

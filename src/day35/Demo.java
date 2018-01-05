package day35;

public class Demo {
    public static  void main(String[] args){
        Persian persian=new Persian();
        persian.me();
        System.out.println("----------------------------");
        Husky husky=new Husky();
        husky.me();
    
        System.out.println("-----------------------------");
        showMe(persian);
        showMe(husky);
    }
    
    public static void showMe(Pet pet){
        pet.me();
    }
}

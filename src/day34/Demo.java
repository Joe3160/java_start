package day34;

public class Demo {
    public static void main(String[] args){
        Dog dog=new Dog();
        String name=dog.getName();
        System.out.println(name);
    
        System.out.println("------------------");
        Husky husky=new Husky();
        String dog_name=husky.getName();
        System.out.println(dog_name);
        husky.something();
        
        
    }
}

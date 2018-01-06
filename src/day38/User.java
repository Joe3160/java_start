package day38;

public class User implements UserInterface,User2Interface {
    private String name;
    
    @Override
    public void setName(String name) {
       this.name=name;
       
    }
    
    @Override
    public String getName() {
        return this.name;
    }
}

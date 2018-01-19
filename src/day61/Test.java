package day61;

public class Test {
    public static void main(String[] args){
        Player player=new Player();
        player.setName("Joe");
        Game game=new Game(player);
        game.start();
    }
}

package day56;

public class Foo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.print("0");
        }
    }
}

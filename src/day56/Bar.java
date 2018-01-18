package day56;

public class Bar implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.print("1");
        }
    }
}

package day57;

public class Bar {
    public static void main(String[] args) {
        Thread t0 = new Thread(new BarThread("0"));
        Thread t1=new Thread(new BarThread("1"));
        t0.start();
        t1.start();

    }
}

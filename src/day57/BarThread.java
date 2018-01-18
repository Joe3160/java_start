package day57;

public class BarThread implements Runnable {

    private String name;

    public BarThread(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.print(this.name);
            Thread.yield();//释放cup资源
        }
    }
}

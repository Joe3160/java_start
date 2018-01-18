package day57;

public class Demo {
    public static void main(String[] args) {
        DemoThread t=new DemoThread();
        t.start();
        for (int i = 0; i <100 ; i++) {
            if (i == 50) {
                try {
                    t.join();//插入进程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(i+"、------");
            }
        }
    }
}

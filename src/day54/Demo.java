package day54;

public class Demo extends Thread {
    private String name;
    public Demo() {

    }

    public Demo(String name) {
        this.name=name;
    }

    public void run(){
        for (int i=0;i<100;i++) {
            try {
                Thread.sleep(100);//100毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Demo("+this.name+")线程："+i);
        }

    }

}

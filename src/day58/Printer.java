package day58;

public class Printer {

    public void print(String name,int num) {
        for (int i = 1; i <=num ; i++) {
            System.out.println("文件名："+name+"，进度"+i+"/"+num);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

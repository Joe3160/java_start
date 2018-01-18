package day59;

public  class Printer {
    public synchronized void print(String name,int num){
        for (int i = 1; i <=num ; i++) {
            System.out.println(""+name+"，进度"+i+"/"+num);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    /**
     * 同步方法加锁
     */
/*    public synchronized void print(String name,int num){
        for (int i = 1; i <=num ; i++) {
            System.out.println(""+name+"，进度"+i+"/"+num);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }*/
}

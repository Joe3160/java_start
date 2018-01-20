package day62;

import java.util.List;

public class Consumer extends Thread {
    private List<Integer> list;
    private int max;

    public Consumer(String name, int max, List<Integer> list) {
        super(name);
        this.list = list;
        this.max = max;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {//对仓库加锁
                while (list.isEmpty()) {
                    System.out.println("仓库空了！！！");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int i=list.size()-1;//假设消费最后一个
                System.out.println(this.getName()+"正在消费"+list.get(i));
                list.remove(i);
                list.notifyAll();
            }
        }

    }
}

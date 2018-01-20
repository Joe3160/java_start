package day62;

import java.util.List;
import java.util.Random;

/**
 * 生产者
 */
public class Producer extends Thread {
    private List<Integer> list;
    private int max;

    public Producer(String name, int max, List<Integer> list) {
        super(name);
        this.list = list;
        this.max = max;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                while (list.size() == max) {
                    System.out.println("仓库已满！");
                    try {
                        list.wait();//线程被挂起
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //生产代码
                Random random = new Random();
                int num = (int)(Math.random() * 100 + 1);
                list.add(num);
                System.out.println(this.getName() + "生成了" + num);
                list.notifyAll();//唤醒所有进程
            }
        }
    }
}

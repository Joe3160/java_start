package day62;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int max = 100;
        Producer producer = new Producer("生产者", max, list);
        Consumer consumer = new Consumer("消费者", max, list);
        producer.start();
        consumer.start();

    }
}

package day28;

import javax.sound.midi.Soundbank;

public class Demo {
    static int anInt = 0;
    
    //静态语句块
    static {
        anInt = 100;
    }
    
    //静态常量
    final static int TEMP = 300;
    
    //构造器
    Demo() {
        System.out.println(anInt);
    }
    
    public static void main(String[] args) {
        new Demo();
    }
    
    
}

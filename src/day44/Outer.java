package day44;

public class Outer {
    private int i=10;

    public class Inner {
        private int i=20;

        public void show(int i) {
            System.out.println(i);//就近原则最近i，方法参数
            System.out.println(this.i);//内部类的成员变量，等效于Inner.this.i
            System.out.println(Inner.this.i);// 类名.this 表示类本身。
            // 同理，在Outer可以定义多个内部类，并且可以通 `类名.成员变量`方式相互调用
            System.out.println(Outer.this.i);//外部类的成员变量
        }

    }
}

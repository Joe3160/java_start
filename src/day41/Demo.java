package day41;

public class Demo {
    public static void main(String[] args) {
        //匿名内部类定义
        OuterInterface outer = new OuterInterface() {
            @Override
            public void show() {
                System.out.println("这是一个匿名类的show方法。");
            }
        };
        outer.show();

        System.out.println("----------------------------");
        Parent son=new Parent(){//一匿名字类继承父类Parent,并重写了show方法
          public void show(){
              System.out.println("这是子类的show()方法");
          }
        };
        son.show();
    }
}

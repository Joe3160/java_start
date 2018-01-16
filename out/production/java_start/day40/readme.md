#### 第40节 内部类

##### 概述 
一个类嵌套在另一个类中，这么类就叫内部类，另一个就外部类
内部类相当于内部类的成员变量

#### 构造内部类

```java
public class Demo {
    public static void main(String[] args){
        Outer outer=new Outer();
        
        Outer.Inner inner=outer.new Inner();//直接实例化内部类 ,new Inner()看成一个整体变量
        inner.say();        
    }
}
```

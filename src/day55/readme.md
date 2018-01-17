#### 第55节 实现`Runnable`接口创建线程

##### 实现`Runnable`接口
```java
class Foo implements Runnable{
    public void run(){
        //执行代码
    }
}
```
调用实例：

    Foo foo=new Foo();
    Thread thread=new Thread(foo);
    thread.start();


##### 两种方法的比较

extends Thread:单继承，除了基类Object,不能再继承其它类
implements Runnable:多实现，推荐，不影响继承
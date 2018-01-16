#### 静态内部类
##### 定义：
> 在内部类前添加 `static`修饰符

1. 静态内部类可以声明`static`成员变量;
2. 非静态内部类不可以声明`static`成员变量;
3. 静态内部类不可以使用外部类的非`static`成员变量
4. 创建静态内部类对象，不需要外部对象


    //创建非静态内部类
    Outer o=new Outer();
    Outer.Inner i=o.new Inner();
    //创建静态内部类
    Outer.Inner inner=new Outer.Inner();

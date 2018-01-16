### 接口的实现
1. 接口的实现
```java
public interface DemoInterface{
    public void hello(String str);
}

public interface Demo2Interface{
    public void hello2(String str);
}

public class Demo implements DemoInterface,Demo2Interface{
    public void hello(String str){
        System.out.println("Hello");
    }
    public void hello2(String str){
            System.out.println("Hello world");
        }
}
```
 - 注意事项：
   * 必须为所有方法提供具体的实现。
   * 必须遵守望重写所有规则：
        * 子类的重写不抛出更大的异常。
        * 子类重写不能有更小的访问范围。
        * 保持相同的返回类型
        
- 继承多个接口：
    * 多个接口用逗号分隔
    * 如果多个接口有相同方法名和变量，相同变量名可以通过 `接口名.变量名` 形式访问,相同方法名只要实现其中一个就可以了。
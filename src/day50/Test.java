package day50;


public class Test {
    public int test(int a, int b) throws FooException {
        if (b == 0) {
            FooException foo = new FooException("计算错误");
            BarException bar = new BarException("除数不能为0");
            foo.initCause(bar);//异常嵌套
            throw foo;
        }
        return a / b;
    }

}

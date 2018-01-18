package day59;

public class FooTest implements Runnable {
    private String name;
    private Foo source;

    public FooTest(String name,Foo source){
        this.name=name;
        this.source=source;
    }


    @Override
    public void run() {
        if (name.equals("show1")) {
            source.show1();
        } else {
            source.show2();
        }

    }
}

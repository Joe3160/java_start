package day42;

public class Outer {
    private String name;

    public InnerInterface foo() {
        final int id=1;
        class Inner implements InnerInterface {
            @Override
            public String say() {
                System.out.printf(name);

                System.out.println(id);
                return name;
            }
        }
        return new Inner();
    }
}

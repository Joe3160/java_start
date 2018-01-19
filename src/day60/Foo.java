package day60;

public class Foo extends Thread {
    Resource re1;
    Resource re2;

    public Foo(Resource re1, Resource re2, String name) {
        super(name);
        this.re1 = re1;
        this.re2 = re2;
    }

    @Override
    public void run() {
        synchronized (re1) {
            System.out.println(this.getName()+"获得了"+re1.name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName()+"在等待"+re2.name);
            synchronized (re2) {
                System.out.println(this.getName()+"获得了"+re2.name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

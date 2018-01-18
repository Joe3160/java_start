package day59;

public class User implements Runnable {
    private Printer printer;
    private String file;
    private int num;
    public User(Printer printer,String file,int num){
        this.printer=printer;
        this.file=file;
        this.num=num;
    }
    @Override
    public void run() {
        printer.print(file,num);
    }
}

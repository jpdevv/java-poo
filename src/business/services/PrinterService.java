package business.services;

public class PrinterService {
    public void println(String s) {
        System.out.println(s);
    }

    public void printf(String s, Object ... args) {
        System.out.printf(s, args);
    }

    public void print(String s) {
        System.out.print(s);
    }
}

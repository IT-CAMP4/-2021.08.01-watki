package pl.camp.it.join;

public class Main {

    public static int counter = 0;
    public static final Object lock = new Object();

    public static void main(String[] args) {
        Thread w1 = new Thread(new Incrementator());
        Thread w2 = new Thread(new Incrementator());
        Thread w3 = new Thread(new Incrementator());

        w1.start();
        w2.start();
        w3.start();

        try {
            w1.join();
            w2.join();
            w3.join();
        } catch (InterruptedException e) {

        }

        System.out.println(Main.counter);
    }
}

package pl.camp.it.join;

public class Incrementator implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            synchronized (Main.lock) {
                Main.counter++;
            }
            //increment();
        }
    }

    private synchronized void increment() {
        Main.counter++;
    }
}

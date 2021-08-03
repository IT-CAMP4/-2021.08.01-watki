package pl.camp.it;

public class Watek extends Thread {
    int threadNumber;

    public Watek(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Wątek: " + this.threadNumber + " - " + i);
        }
    }
}

package pl.camp.it.notify;

public class Receiver implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.lock) {
                System.out.println("Odbieracz czeka !!");

                while(!Main.notifyFlag) {
                    Main.lock.wait();
                }

                System.out.println("Odebrałem wiadomośc !!");
                System.out.println(Main.messsage);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

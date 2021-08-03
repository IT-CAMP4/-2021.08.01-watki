package pl.camp.it.notify;

public class Sender implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.lock) {
                System.out.println("Wysyłacz coś robi !!");
                Thread.sleep(1000);
                System.out.println("Wysyłacz nadal coś robi !!");
                Thread.sleep(1000);
                System.out.println("Wysyłacz dalej coś robi !!");
                Thread.sleep(1000);
                System.out.println("Wysyłacz wysyła");
                Main.messsage = "Jakaś wiadomość !!";
                Main.notifyFlag = true;
                Main.lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

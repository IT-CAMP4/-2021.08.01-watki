package pl.camp.it;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*Watek w1 = new Watek(1);
        Watek w2 = new Watek(2);
        Watek w3 = new Watek(3);
        Watek w4 = new Watek(4);
        Watek w5 = new Watek(5);
        Watek w6 = new Watek(6);
        Watek w7 = new Watek(7);


        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();
        w6.start();
        w7.start();*/

        /*Thread lw1 = new Thread(new LepszyWatek());
        Thread lw2 = new Thread(new LepszyWatek());
        Thread lw3 = new Thread(new LepszyWatek());
        lw1.start();
        lw2.start();
        lw3.start();*/

        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        /*singleExecutor.submit(new LepszyWatek());
        singleExecutor.submit(new LepszyWatek());
        singleExecutor.submit(new LepszyWatek());*/

        singleExecutor.shutdown();

        ExecutorService multiExecutor = Executors.newFixedThreadPool(3);
        /*multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());*/

        multiExecutor.shutdown();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        scheduledExecutorService.schedule(new LepszyWatek(), 2, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(), 1, TimeUnit.MINUTES);
        scheduledExecutorService.schedule(new LepszyWatek(), 20, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(), 1, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(), 2, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(), 2, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(), 2, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();

        System.out.println("Koniec maina !!");
    }
}

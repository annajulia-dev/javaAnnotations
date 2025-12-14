package classes.Threading;

import java.util.Random;

public class Car implements Runnable{

    private final String name;
    private final int totalDistance;
    private int currentDistance;
    private static volatile boolean raceFinished = false;


    Random random = new Random();


    public Car(String name, int totalDistance){
        this.name = name;
        this.totalDistance = totalDistance;
        this.currentDistance = 0;
    }

    @Override
    public void run(){
        while(this.currentDistance < this.totalDistance && !raceFinished){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread Interrupted!");
            }

            if (raceFinished){
                System.out.println(this.name + " Lose!");
                return;
            }

            this.currentDistance += random.nextInt(10) + 1;
            System.out.println(this.name + " CurrentDistance: " + currentDistance);

            if(currentDistance >= totalDistance){
                System.out.println(this.name + " Win!");
                raceFinished = true;
            }

        }
    }

}

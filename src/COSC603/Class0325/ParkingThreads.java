package COSC603.Class0325;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * simulates a parking lot, you can specify spots available
 * based on a car arrival rate of 5 to 15 minutes, determine over a 100 hours period
 * how much money is earned and how many cars are turned away because of the lot is full
 * 1 minute is represented by 1 millisecond in this program
 */
public class ParkingThreads
{
    private int carsInParkingLot = 0;
    private int parkingLotSize = 0;
    private double revenue = 0;
    private int carsNotEntering = 0;
    private final Lock parkingLotLock = new ReentrantLock();
    private final Lock revenueLock = new ReentrantLock();

    public final static double COST_PER_HOUR = 2.5;
    public final static int SIMULATION_TIME = 600; //10 hours or 600 minutes

    public ParkingThreads()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many parking spots we have? ");
        parkingLotSize = input.nextInt();

        ArrivalThread arrivals = new ArrivalThread();
        Thread t = new Thread(arrivals);
        t.start();

        try
        {
            Thread.sleep(SIMULATION_TIME);

            arrivals.stopArrivals();

            while (carsInParkingLot > 0)
            {
                Thread.sleep(10);
            }
            System.out.println("------results------");
            System.out.println(carsNotEntering + " did not enter because of full");
            System.out.println(revenue + " was earned by cars parking");
        } catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        new ParkingThreads();
    }

    /**
     * car arrival thread handles cars arriving at 5 - 15minutes intervals
     * a car goes into the parking lot if not full, otherwise leave
     */
    private class ArrivalThread implements Runnable
    {
        boolean isRunning = true;
        public static final int MIN_ARRIVAL = 5;
        public static final int MAX_ARRIVAL = 15;

        @Override
        public void run()
        {
            try
            {
                while (isRunning)
                {
                    int delayTime = (int)(Math.random() * (MAX_ARRIVAL - MIN_ARRIVAL) + MIN_ARRIVAL);
                    Thread.sleep(delayTime);

                    //new car is coming
                    parkingLotLock.lock();
                    if(carsInParkingLot < parkingLotSize)
                    {
                        System.out.println("car enters lot");
                        carsInParkingLot++;
                        //create a new car waiting thread
                        Thread t = new Thread(new CarWaitingThread());
                        t.start();
                    }else
                    {
                        System.out.println("lot full");
                        carsNotEntering++;
                    }
                    parkingLotLock.unlock();
                }
            }catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }

        }

        public void stopArrivals()
        {
            isRunning = false;
        }
    }

    public class CarWaitingThread implements Runnable
    {
        public static final int MIN_WAIT = 60;
        public static final int MAX_WAIT = 600;


        @Override
        public void run()
        {
            int waitTime = (int)(Math.random() * (MAX_WAIT - MIN_WAIT) + MIN_WAIT);

            try
            {
                Thread.sleep(waitTime);
            }catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }

            System.out.println("Car is leaving...");
            parkingLotLock.lock();
            carsInParkingLot--;
            parkingLotLock.unlock();

            revenueLock.lock();
            revenue += waitTime / 60.0 * COST_PER_HOUR;
            revenueLock.unlock();
        }
    }
}

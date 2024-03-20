package COSC603.Class0320;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsumerProducerUsingBlockQueue
{
    private static ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(2);

    public static void main(String[] args)
    {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new ProducerTask());
        es.execute(new ConsumerTask());

        es.shutdown();
    }
    private static class ProducerTask implements Runnable
    {
        @Override
        public void run()
        {
            try
            {
                int i = 1;
                while (true)
                {
                    System.out.println("Producer writes " + i);
                    buffer.put(i++);

                    Thread.sleep((int)(Math.random() * 10000));
                }
            }catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    private static class ConsumerTask implements Runnable
    {
        @Override
        public void run()
        {
            try
            {
                while (true)
                {
                    int value = buffer.take();
                    System.out.println("\t\t\tConsumer read " + value);
                    Thread.sleep((int) (Math.random() * 10000));
                }
            } catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

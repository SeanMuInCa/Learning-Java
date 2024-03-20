package COSC603.Class0320;


import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConsumerProducer
{
    private static Buffer buffer = new Buffer();

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
                    buffer.write(i++);
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
                    int value = buffer.read();
                    System.out.println("\t\t\tConsumer read " + value);
                    Thread.sleep((int)(Math.random() * 10000));
                }
            }catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }




    private static class Buffer
    {
        private static final int CAPACITY = 1;
        private LinkedList<Integer> queue = new LinkedList<>();

        private static Lock lock = new ReentrantLock();

        //two conditions
        private static Condition notEmpty = lock.newCondition();
        private static Condition notFull = lock.newCondition();

        private void write(int value)
        {
            lock.lock();
            try
            {
                while (queue.size() == CAPACITY)//while it's full, wait for not full
                {
                    System.out.println("it's full now, wait for not full condition");
                    notFull.await();
                }
                queue.offer(value);
                notEmpty.signal();//signal not empty condition
            }catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }finally
            {
                lock.unlock();
            }
        }

        private int read()
        {
            int value = 0;
            lock.lock();
            try
            {
                while (queue.isEmpty())//while it's empty, we wait for not empty
                {
                    System.out.println("\t\t\tit's empty now, wait for not empty condition");
                    notEmpty.await();
                }
                value = queue.remove();
                notFull.signal();
            }catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }finally
            {
                lock.unlock();
            }
            return value;
        }
    }
}


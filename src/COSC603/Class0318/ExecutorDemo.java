package COSC603.Class0318;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo
{
    public static void main(String[] args)
    {
        ExecutorService es = Executors.newFixedThreadPool(3);

        es.execute(new PrintChar('a', 1000));
        es.execute(new PrintChar('b', 800));
        es.execute(new PrintNum(100));

        es.shutdown();
    }
}

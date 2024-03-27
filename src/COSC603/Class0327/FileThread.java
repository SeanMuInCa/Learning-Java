package COSC603.Class0327;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileThread
{
    public static void main(String[] args)
    {
        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++)
        {
            es.execute(new AddALine(i));
        }

        es.shutdown();


    }

    private static class AddALine implements Runnable
    {
        private int numberToWrite;
        public AddALine(int numberToWrite)
        {
            this.numberToWrite = numberToWrite;
        }
        @Override
        public void run()
        {
            try(
                    FileWriter fw = new FileWriter("test.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    )
            {
                pw.println(numberToWrite);
            } catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}

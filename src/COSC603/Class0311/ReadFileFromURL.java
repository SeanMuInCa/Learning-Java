package COSC603.Class0311;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL
{
    public static void main(String[] args)
    {
        System.out.print("Enter a url: ");

        String urlString = new Scanner(System.in).nextLine();

        try
        {
            URL myUrl = new URL(urlString);
            int count = 0;
            Scanner input = new Scanner(myUrl.openStream());
            while (input.hasNext())
            {
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("the size is " + count + " chars");
        } catch (MalformedURLException e)
        {
            System.out.println("wrong format of url");
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}

package COSC603.Class0311;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler
{
    public static void main(String[] args)
    {
        System.out.print("Enter a url: ");

        String urlString = new Scanner(System.in).nextLine();

        crawler(urlString);
    }

    /**
     * traverse the web from the starting url
     * @param startingURL string of a url
     */
    private static void crawler(String startingURL)
    {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();//visited urls

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100)
        {
            String urlString = listOfPendingURLs.remove(0);
            if(!listOfTraversedURLs.contains(urlString))
            {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl " + urlString);
                for (String s : getSubURLs(urlString))
                {
                    if(!listOfTraversedURLs.contains(s))
                    {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }
    }

    private static ArrayList<String> getSubURLs(String urlString)
    {
        ArrayList<String> list = new ArrayList<>();
        try
        {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int cur = 0;
            while (input.hasNext())
            {
                String line = input.nextLine();
                cur = line.indexOf("http", cur);
                while (cur > 0)
                {
                    int endIndex = line.indexOf("\"", cur);
                    if(endIndex > 0)
                    {
                        list.add(line.substring(cur,endIndex));
                        cur = line.indexOf("http", endIndex);
                    }else
                    {
                        cur = -1;
                    }
                }
            }
        } catch (MalformedURLException e)
        {
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return list;
    }
}

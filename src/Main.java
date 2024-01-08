public class Main
{
    public static void main(String[] args)
    {
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++)
        {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        int count = 0; // The number of elements above average
        for (int i = 0; i < n; i++)
            if (numbers[i] > average)
                count++;

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);*/

        int[] arr = {2, 3, 1, 1, 12, 2, 3, 123, 112, 12, 21, 23};
        Sorter.recSelectionSort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 5 == 0) System.out.println();
        }
    }
}
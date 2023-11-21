package Class1005;

public class Practice5
{
    public static void main(String[] args)
    {
        System.out.println(test(5));
        System.out.println(countLetter("A love java", 'A'));
        System.out.println(calculateTaxes(5,1,5));

    }
    public static boolean test(int number){
        return number % 2 == 0;
    }
    public static int countLetter(String str, char character){
        int counter = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if(str.toUpperCase().charAt(i) == character || str.toLowerCase().charAt(i) == character)
                counter++;
        }
        return counter;
    }
    public static double calculateTaxes(double price, int quantity, float rate){
        return price * quantity * rate /100;
    }

}

import COSC601.Class1024.StrBuffer;

public class Test
{
    public static void main(String[] args)
    {
        char[] myChars = {'a','b','c','d','e','f','g'};
        char[] myChars1 = {'j','k','l'};
        StrBuffer strBuffer = new StrBuffer(myChars);
        System.out.println(strBuffer);
        char[] testChar = new char[3];
        System.out.println(testChar);
        boolean res = strBuffer.getChars(3,6,testChar,0);
//        System.out.println(res);
        System.out.println(testChar);
        char[] res1 = new char[myChars.length];
        strBuffer.copy(myChars,res1,0);
        System.out.println(res1);
        String src = "i love java";
        String dest= "";
        strBuffer.append(myChars1);
        System.out.println(strBuffer);
    }
}

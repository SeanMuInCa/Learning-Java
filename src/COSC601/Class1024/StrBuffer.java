package COSC601.Class1024;

/**
 * Description: This class is a simple representation of a String or
 * StringBuffer.  The purpose of this class is to demonstrate array concepts and
 * show how the StringBuffer class works.
 * Copyright: Copyright (c) 2003
 * Company: SIAST
 *
 * @author Hugh Foster
 * @version 1.0
 */
public class StrBuffer
{
    private char[] value;// the character array used to store a string

    public static final int DEFAULT_SIZE = 20;
    public static final char UNKNOWN = '\u0000';

    public StrBuffer()
    {
        value = null;
    }

    public StrBuffer(char[] buffer){
        value = this.copy(buffer);
    }
    public StrBuffer(StrBuffer buffer){
        value = this.copy(buffer.value);
    }

    /**
     *
     * @param index
     * @return
     */
    public char charAt(int index)
    {
        if (value == null || index < 0 || index > value.length)
        {
            return UNKNOWN;
        }
        return value[index];
    }

    public String toString()
    {
        String str = "";
        for (int i = 0; i < value.length; i++)
        {
            str += value[i];
        }
        return str;
    }
    public String[] copy(String[] strArr){
        String[] newArr = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++)
        {
            newArr[i] = strArr[i];
        }
        return newArr;
    }
    public int[] copy(int[] strArr){
        int[] newArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++)
        {
            newArr[i] = strArr[i];
        }
        return newArr;
    }
    public char[] copy(char[] strArr){
        char[] newArr = new char[strArr.length];
        System.arraycopy(strArr, 0, newArr, 0, strArr.length);
        return newArr;
    }

    public boolean getChars(int srcBegin, int srcEnd, char[] dest, int destBegin){
        boolean flag = false;
        for (int i = srcBegin; i < srcEnd; i++)
        {
            dest[destBegin++] = value[i];
            flag = true;
        }
        return flag;
    }
    public void copy(char[] src, char[] dest, int srcBegin){
        System.arraycopy(src, srcBegin, dest, 0, src.length);
    }

    public void append(char[] src){
        char[] temp = new char[src.length + value.length];
        copy(value,temp,0);
        copy(src,temp, value.length);
        value = temp;
//        return new StrBuffer(value);
    }
    public void append(int val){
        String strVal = val + "";
        append(strVal.toCharArray());
    }
    public void append(double val){
        String strVal = val + "";
        append(strVal.toCharArray());
    }
    public void append(String val){
        append(val.toCharArray());
    }
    public int indexOf(char c){
        int index = -1;
        for (int i = 0; i < value.length; i++)
        {
            if(value[i] == c){
                index = i;
                break;
            }
        }
        return index;
    }
    public int lastIndexOf(char c){
        int index = -1;
        for (int i = value.length - 1; i >= 0; i--)
        {
            if(value[i] == c){
                index = i;
                break;
            }
        }
        return index;
    }
}

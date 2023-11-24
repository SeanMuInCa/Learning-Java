import static org.junit.jupiter.api.Assertions.*;

class Assign1MethodsTest
{
    int[] a = {1,3,7};
    int[] b = {1,4,6};
    int[] c = {3,7};
    @org.junit.jupiter.api.Test
    void arrayMedium()
    {
        /*assertEquals(4,Assign1Methods.arrayMedium(a));
        assertEquals(3,Assign1Methods.arrayMedium(b));*/
    }
    @org.junit.jupiter.api.Test
    void arrayDiff(){
        assertArrayEquals(c,Assign1Methods.arrayDiff(a,b));
    }
}
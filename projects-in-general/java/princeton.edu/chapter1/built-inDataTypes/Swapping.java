
public class Swapping
{

    public static void swap()
    {
        int a = 1, b = 2;
        int t;
        
        //Swapping
        t = a;
        a = b;
        b = t;

    }

    //Remember to use in the command java the option -ea or -enableassertions
    public static void testingSwap()
    {
        
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a, b, t;

        for(int i = 0; i < arr.length-1; i+=2)
        {
            a = arr[i]; b = arr[i+1];
            t = a;
            a = b;
            b = t;
            assert a == arr[i+1] && b == arr[i] : "Error swapping variables";
        }

    }

    public static void main(String... args)
    {
        testingSwap();
    }

}

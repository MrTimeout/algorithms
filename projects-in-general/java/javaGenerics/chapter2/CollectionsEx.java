
import java.util.List;
import java.util.ArrayList;

public class CollectionsEx
{

    public static void main(String... args)
    {
        Test.copy();
        Test.plusTwo();
    }
        
}

class Test
{

    public static void copy() throws java.lang.IllegalArgumentException
    {
        List<Integer> ints = new ArrayList<Integer>(java.util.Arrays.<Integer>asList(1, 2, 3));
        List<Number> nums = java.util.Arrays.<Number>asList(1, 1.5, 1);
        Garbage.copy(nums, ints);
        Garbage.printXX(nums);
    }

    public static void plusTwo()
    {
        List<Number> ints = new ArrayList<Number>(java.util.Arrays.<Number>asList(1, 2, 4, 5));
        System.out.println("Adding two: ");
        Garbage.plusTwo(ints);
        System.out.println("Printing the result by reference: ");
        Garbage.printXX(ints);
    }

}

class Garbage
{

    public static <T> boolean copy(List<? super T> dst, List<? extends T> src) throws java.lang.IllegalArgumentException
    {
        if(src.size() <= 0 || src.size() > dst.size())
            throw new java.lang.IllegalArgumentException("Error passing args");
        for(int i = 0; i < src.size(); i++)
            dst.set(i, src.get(i));
        System.out.println(dst.getClass().getCanonicalName());
        printXX(dst);
        return true;
    }

    public static <T> void printXX(List<? extends T> src)
    {
        for(int i = 0; i < src.size(); i++)
            System.out.println(src.get(i));
    }

    public static <T> void plusTwo(List<Number> list)
    {
        Integer t;
        for(java.util.Iterator it = list.iterator(); it.hasNext();)
        {
            t = (Integer)it.next();
            t += 2;
        }
        printXX(list);
    }

}


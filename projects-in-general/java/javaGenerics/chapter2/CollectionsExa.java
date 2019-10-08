
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsExa
{
    
    public static void main(String... args)
    {
        Test.testCount();
        Test.testSumCount();
    }

}

@FunctionalInterface
interface Consumer<T>
{
    void accept(T t);
}

class Print
{
    
    public static <T> void printCol(Collection<T> l, Consumer<T> c)
    {
        for(T t: l)
            c.accept(t);
    }

}

class Test
{
    
    public static void testCount()
    {
        List<Integer> ints = new ArrayList<Integer>();
        Garbage.count(ints, 5);
        System.out.println("Using arraylist of integers:");
        Print.printCol(ints, (Integer i) -> System.out.printf("class: %s -> value: %d\n", i.getClass().getCanonicalName(), i.intValue()));

        System.out.println("Using arraylist of Numbers:");
        List<Number> nums = new ArrayList<Number>();
        Garbage.count(nums, 5);
        Print.printCol(nums, (Number i) -> System.out.printf("class: %s -> value: %d\n", i.getClass().getCanonicalName(), i.intValue()));

        System.out.println("Using arraylist of Objects:");
        List<Object> objs = new ArrayList<Object>();
        Garbage.count(objs, 5);
        objs.add("String");
        Print.printCol(objs, (Object i) -> System.out.printf("class: %s -> value: %s\n", i.getClass().getCanonicalName(), i));

    }

    public static void testSumCount()
    {
        List<Number> ints = new ArrayList<Number>();
        System.out.printf("Value of the sum: %.2f\n", Garbage.sumCount(ints, 4));
    }

}

class Garbage
{

    public static <T> double sum(Collection<? extends Number> list)
    {
        double d = 0;
        for(Iterator<? extends Number> it = list.iterator(); it.hasNext();) d += it.next().doubleValue();
        return d;
    }

    public static <T> void count(Collection<? super Integer> list, int n)
    {
        for(int i = 0; i < n; i++) list.add(i);
    }

    public static <T> double sumCount(Collection<Number> col, int n) // remember that if you put and get values from a structure, dont use a wildcard ?
    {
        count(col, n);
        return sum(col);
    }
}

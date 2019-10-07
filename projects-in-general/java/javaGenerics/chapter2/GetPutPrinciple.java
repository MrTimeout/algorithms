
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class GetPutPrinciple
{
    
    public static void main(String... args)
    {
        Test.testSumDouble();
    }

}

class Test
{
        
    public static void testSumDouble()
    {
        List<Number> nums = new ArrayList<Number>(Arrays.<Number>asList(1, 2, 3, 8.4));
        System.out.printf("Sum( ");
        Print.processConsumer(nums, (Number n) -> System.out.printf("%.2f ", n.doubleValue())); 
        System.out.printf(") = %.2f", Garbage.sumDouble(nums));
    }
}

@FunctionalInterface
interface Consumer<T>
{
    void accept(T t);
}

class Print
{
    
    public static <T> void processConsumer(List<T> list, Consumer<T> c)
    {
        for(T t: list)
            c.accept(t);
    }

}


class Garbage
{
    
    public static <T> void copy(List<? super T> dst, List<? extends T> src)
    {
        if(src.size() <= 0 || src.size() > dst.size())
            throw new java.lang.IllegalArgumentException("Expected list with more than 0 elments and less than the other list");
        for(int i = 0; i < src.size(); i++)
            dst.set(i, src.get(i));
    }

    public static <T> double sumDouble(List<? extends Number> src)
    {
        double d = 0;
        for(Iterator<? extends Number> it = src.iterator(); it.hasNext();) d += it.next().doubleValue();
        return d;
    }

}


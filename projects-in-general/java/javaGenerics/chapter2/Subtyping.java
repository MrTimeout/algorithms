
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Subtyping
{

    public static void numbers()
    {
        List<Number> nums = new ArrayList<>();
        nums.add(2.5); //autoboxing to Double -> Number.
        nums.add(2);  //autoboxing to Integer -> Number.
        for(Iterator<Number> it = nums.iterator(); it.hasNext();)
            System.out.println(it.next());

        List<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(3);
        // List<Number> numss = ints; -- compilation error. Remember that Integer is a subtype of Number, but not List<Integer> is a subtype of List<Number>
        ints.add(2);
        printAll(ints, new Consumer<Integer>()
                {
                    public void accept(Integer n)
                    {
                        System.out.println(n);
                    }   
                });
        
        Integer[] integers = new Integer[]{1, 2, 3, 4};
        Number[] numbers = integers;

        print(numbers, new Consumer<Number>()
                {
                    public void accept(Number n)
                    {
                        System.out.println(n);
                    }       
                });

    } 

    public static <T> void print(T[] arr, Consumer<T> c)
    {
        for(T t: arr)
            c.accept(t);
    }

    public static <T> void printAll(List<T> l, Consumer<T> c)
    {
        for(T t: l)
            c.accept(t);
    }
    
    public static void main(String... args)
    {
        numbers();
    }

}

@FunctionalInterface
interface Consumer<T>
{
    void accept(T t);
}

/**
 *  java.lang.Integer is a subtype of java.lang.Number
 *  java.lang.Double is a subtype of java.lang.Number
 *  java.util.ArrayList<E> is a subtype of java.util.List<E> 
 *  java.util.List<E> is a subtype of java.util.Collection<E>
 *  java.util.Collection<E> is a subtype of java.lang.Iterable<E>
 */

/**
 * interface Collection<E>
 * {
 *      public boolean add(E e);
 * }
 */

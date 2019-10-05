
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

public class Overview
{

    /**
     * The foreach loop can be used in any object that implements the interface java.lang.Iterable<E>, which in turn refers to java.util.Iterator<E>
     * interface Iterable<E>
     * {
     *      public Iterator<E> iterator();
     * }
     * interface Iterator<E>
     * {
     *      public E next();
     *      public boolean hasNext();
     *      public void remove();
     * }
     */
    public static void forEach()
    {
        List<Integer> l = Arrays.asList(1, 2, 3);
        int sum = 0;

        for(int s: l)
           sum += s;

        assert sum == 6; 

        sum = 0;
        for(Iterator<Integer> it = l.iterator(); it.hasNext();)
            sum += it.next();

        assert sum == 6;

        int[] arr = new int[]{1, 2, 3};
        sum = 0;

        for(int a: arr)
            sum += a;

        assert sum == 6;

    }

    /**
     * It is required to use cache when converting(boxing) an int, short value from [-128, 127], a char from '\u0000' to '\u007f', a byte or a boolean to his wrapper class.
     *
     */
    public static void equivalence()
    {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(new Integer(2)); //second and third option are similar, but the next can cache the value to optimize the execution
        ints.add(Integer.valueOf(3));

        List<Integer> intss = Arrays.asList(100, 200, 300);

        assert sumInts(intss) == sumIntegers(intss);
        assert sumIntegers(intss) != sumIntegers(intss); // NOT RECOMMEND

        assert sumInts(ints) == sumIntegers(ints);
        assert sumIntegers(ints) == sumIntegers(ints); //Because it uses cache. Remember that the value is a int < 127 and > -128. NOT RECOMMEND

    }

    public static int sumInts(List<Integer> ints)
    {
        int sum = 0;
        for(int i: ints) sum += i; //Autoboxing from Integer to int using the wrapper class java.lang.Integer
        return sum;
    }

    public static java.lang.Integer sumIntegers(List<Integer> integers)
    {
        Integer sum = new Integer(0);
        for(Integer i: integers) sum += i;
        return sum;
    }

    @SuppressWarnings("unchecked")
    public static void loopingStrings()
    {
        //Before Generics
        List words = new ArrayList();
        words.add("Hello ");
        words.add("World!");
        String s = ((String) words.get(0)) + ((String) words.get(1));

        assert "Hello World!".equals(s);

        //After generics
        List<String> wordsG = new ArrayList<String>();
        wordsG.add("Hello ");
        wordsG.add("World!");
        String sG = wordsG.get(0) + wordsG.get(1);
        
        assert "Hello World!".equals(sG);

    }

    public static void looping()
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int sum = 0;
        
        for(int n: numbers) sum += n; 
        
        assert sum == 6;
        
        List ints = Arrays.asList(new java.lang.Integer[]{
            new Integer(1), new Integer(2), new Integer(3)
        });
        sum = 0;

        for(Iterator it = ints.iterator(); it.hasNext();)
        {
            int n = ((Integer)it.next()).intValue();
            sum += n;
        }

        assert sum == 6;

        int[] intArr = new int[]{ 1, 2, 3 };
        sum = 0;

        for(int i = 0; i < intArr.length; i++) sum += intArr[i];

        assert sum == 6;

    }
    
    public static void main(String[] args)
    {
        looping();
        loopingStrings();
        equivalence();
        forEach();
    }

}

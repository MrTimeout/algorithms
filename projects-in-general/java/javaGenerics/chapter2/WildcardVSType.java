
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class WildcardVSType
{
    
    public static void main(String... args)
    {
        Test.testContains();
        Test.testContainsAll();
    }

}

class Test
{
    
    public static void testContains()
    {
        List<Object> objs = new ArrayList<Object>(Arrays.<Object>asList(1, 2, "3", true));
        assert Garbage.contains(objs, new java.lang.Boolean(true));

        List<Integer> ints = new ArrayList<Integer>(Arrays.<Integer>asList(1, 2, -1));
        assert Garbage.contains(ints, new Integer(1));

        List<Double> doubles = new ArrayList<Double>(Arrays.<Double>asList(1.0, 2.5, 3.14));
        assert !Garbage.contains(doubles, new Double(1.1));

    }

    public static void testContainsAll()
    {
        List<Object> objs = new ArrayList<Object>(Arrays.<Object>asList(1, 2, "3", true));
        List<Boolean> bools = new ArrayList<Boolean>(Arrays.<Boolean>asList(true));
        assert Garbage.containsAll(objs, bools);

        List<Integer> ints = new ArrayList<Integer>(Arrays.<Integer>asList(1, 2, -1));
        List<Integer> intss = new ArrayList<Integer>(Arrays.<Integer>asList(2, -1));
        assert Garbage.containsAll(ints, intss);

        List<Double> doubles = new ArrayList<Double>(Arrays.<Double>asList(1.0, 2.5, 3.14));
        List<Double> doubless = new ArrayList<Double>(Arrays.<Double>asList(1.1));
        assert !Garbage.containsAll(doubles, doubless);

    }

}

class Garbage
{
    
    public static <T> boolean contains(Collection<? extends Object> objs, Object o)
    {
        for(java.util.Iterator<? extends Object> it = objs.iterator(); it.hasNext();)
            if(it.next().equals(o))
                return true;
        return false;
    }

    //Collection<?> is the same as Collection<? extends Object>
    public static <T> boolean containsAll(Collection<? extends Object> src, Collection<?> c)
    {
        if(c.size() <= 0 || src.size() <= 0)
            throw new java.lang.IllegalArgumentException("Error parsing the args");
        if(c.size() > src.size())
            return false;
        for(java.util.Iterator<?> it = c.iterator(); it.hasNext();)
            if(!contains(src, it.next()))
                return false;
        return true;
    }

}

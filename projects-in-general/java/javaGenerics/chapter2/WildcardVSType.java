
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class WildcardVSType
{
    
    public static void main(String... args)
    {
        Test.testContains();
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


}


import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class Overview
{

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

    }
    
    public static void main(String[] args)
    {
        looping();
    }

}

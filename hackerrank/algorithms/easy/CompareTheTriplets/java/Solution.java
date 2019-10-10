
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{   

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) 
    {
        List<Integer> l = new ArrayList<Integer>(Arrays.<Integer>asList(0, 0));
        for(int i = 0; i < a.size(); i++)
            if(a.get(i) > b.get(i))
                l.set(0, l.get(0)+1);
            else if(a.get(i) < b.get(i))
                l.set(1, l.get(1)+1);
        return l;
    }
    
    public static void main(String... args)
    {
        System.out.println(compareTriplets(new ArrayList<Integer>(Arrays.<Integer>asList(17, 28, 30)), new ArrayList<Integer>(Arrays.<Integer>asList(99, 16, 8))));
    }

}


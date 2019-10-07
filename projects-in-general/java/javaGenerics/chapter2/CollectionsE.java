
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionsE
{
    
    public static void main(String... args)
    {
        Test.testCopy();
    }

}

class Test
{
    public static void testCopy()
    {
        List<Integer> ints = Arrays.<Integer>asList(1, 2, 3, 4, 5);
        List<Integer> intss = new ArrayList<Integer>(Arrays.<Integer>asList(0,0,0,0,0));

        assert ints.size() == intss.size();

        System.out.println("Before the copy method: ");
        Print.processConsumer(intss, (Integer i) -> System.out.printf("class: %s -> %d\n", i.getClass().getCanonicalName(), i));

        Garbage.copy(intss, ints);

        System.out.println("After the copy method: ");
        Print.processConsumer(intss, new Consumer<Integer>(){
            @Override
            public void accept(Integer i)
            {
                System.out.printf("class: %s -> %d\n", i.getClass().getCanonicalName(), i);
            }
        });

        intss = Arrays.<Integer>asList(0,0,0,0,0);
        
        assert ints.size() == intss.size();

        System.out.println("Before the copyy method: ");
        Print.processConsumer(intss, (Integer i) -> System.out.printf("class: %s -> %d\n", i.getClass().getCanonicalName(), i));

        Garbage.copyy(intss, ints);

        System.out.println("After the copyy method: ");
        Print.processConsumer(intss, new Consumer<Integer>(){
            @Override
            public void accept(Integer i)
            {
                System.out.printf("class: %s -> %d\n", i.getClass().getCanonicalName(), i);
            }
        });

    }

    public static <T> void testCopyExtends()
    {
        List<Integer> ints = new ArrayList<Integer>(Arrays.<Integer>asList(1, 2, 3, 4, 5));
        List<Number> nums = new ArrayList<Number>(Arrays.<Number>asList(0,0,0,0,0));

        assert ints.size() == nums.size();

        System.out.println("Before copying in extends form <? extends T>");
        Print.processConsumer(nums, (Number i) -> System.out.printf("class: %s -> %d\n", i.getClass().getCanonicalName(), i.intValue()));

        Garbage.copyE(nums, ints);

        System.out.println("After copying in extends form <? extends T>");
        Print.processConsumer(nums, (Number i) -> System.out.printf("class: %s -> %d\n", i.getClass().getCanonicalName(), i.intValue()));

    }

}

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

    public static <T> void copy(List<T> dst, List<T> src)
    {
        if(src.size() <=0 || src.size() > dst.size())
            throw new java.lang.IllegalArgumentException("Error parsing arguments");
        ListIterator<T> it = dst.listIterator();
        for(Iterator<T> i = src.iterator(); i.hasNext();)
        {
            it.next();
            it.set(i.next());
        }
    }

    public static <T> void copyy(List<T> dst, List<T> src)
    {
        if(src.size() <=0 || src.size() > dst.size())
            throw new java.lang.IllegalArgumentException("Error parsing arguments");
        for(int i = 0; i < src.size(); i++)
            dst.set(i, src.get(i));
    }

    public static <T> void copyE(List<T> dst, List<? extends T> src)
    {
        if(src.size() <=0 || src.size() > dst.size())
            throw new java.lang.IllegalArgumentException("Error parsing arguments");
        for(int i = 0; i < src.size(); i++)
            dst.set(i, src.get(i));
    }

}

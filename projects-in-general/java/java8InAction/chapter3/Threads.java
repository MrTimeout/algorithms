
import java.util.Arrays;
import java.util.List;
import java.lang.Runnable;

public class Threads
{

    public static <T> void filter(List<T> l, GenericPredicate<T> gp)
    {
        for(T t: l)
            if(gp.test(t))
                System.out.println(t);
    }

    public static void process(Runnable r)
    {
        r.run();
    }
    
    public static void main(String[] args)
    {
        process(new Runnable()
                {
                    public void run()
                    {
                        System.out.println("I am very verbose, but also awesome");
                    }   
                });
        process(() -> System.out.println("Hello lambdas using Runnable interface."));
        filter(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), (Integer i) -> i%2==0);
    }

}

//Remenber that the interface Runnable is like that
//interface Runnable
//{
//    void run();
//}

@FunctionalInterface
interface GenericPredicate<T>
{
    boolean test(T t);
}



import java.util.List;
import java.util.ArrayList;

public class Vararg
{

    public static <T> List<T> toListFromArr(T[] args)
    {
        List<T> l = new ArrayList<T>();
        for(T t: args)
            l.add(t);
        return l;
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> toListVarags(T... args) //Dont use generic types with varagrs, because it creates an array at runtime, so, be careful
    {
        List<T> l = new ArrayList<T>();
        for(T t: args)
            l.add(t);
        return l;
    }

    public static <T> void printAll(List<T> arg, Consumer<T> c)
    {
        for(T t: arg)
            c.accept(t);
    }

    public static void main(String... args)
    {
        printAll(toListFromArr(new String[]{"First", "Second", "Third"}), new Consumer<String>()
                {
                    public void accept(String str)
                    {
                        System.out.printf("This is the %s element\n", str);
                    }   
                });
        printAll(toListVarags("First", "Second", "Third"), new Consumer<String>()
                {
                    public void accept(String str)
                    {
                        System.out.printf("This is the %s element\n", str);
                    }   
                });
    }

}

@FunctionalInterface
interface Consumer<T>
{
    void accept(T t);
}


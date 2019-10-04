
import java.util.List;
import java.util.ArrayList;

public class Practise
{
   
    public static void playingWithStudents()
    {
        randomValues(100, () -> )
    } 

    public static void main(String[] args)
    {

    }

}

@FunctionalInterface
interface Predicate<T>
{
    boolean test(T t);
}

@FunctionalInterface
interface Formatter<T>
{
    String format(T t);
}

@FunctionalInterface
interface Rndom<T>
{
    <T> T rand(T t);
}

class Garbage
{
    
    public static <T> List<T> filter(List<T> l, Predicate<T> p)
    {
        List<T> r = new ArrayList<>();
        for(T t: l)
            if(p.test(t))
                r.add(t);
    }

    public static String print(List<T> l, Formatter<T> f)
    {
        String str = "";
        for(T t: l)
            str += f.format(t);
        return str;
    }

    public static <T> T randomValues(Integer i, Rndom<T> ra)
    {
        List<T> r = new ArrayList<>();
        for(int ii = 0; ii < i; i++)
            r.add(ra.rand(ii));
        return r;
    }

}

class Student
{
    
    private String name;
    private int mark;

    public Student()
    {

    }

    public Student(String name, int mark)
    {
        this.name = name;
        this.mark = mark;
    }

    public String getName()
    {
        return this.name;
    }

    public int getMark()
    {
        return this.mark;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMark(int mark)
    {
        this.mark = mark;
    }

    @Override
    public String toString()
    {
        return String.format("{ Name: %s, Mark: %d }", this.name, this.mark);
    }

}

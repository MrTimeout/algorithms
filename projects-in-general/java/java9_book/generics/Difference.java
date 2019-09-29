
import java.util.List;
import java.util.ArrayList;

public class Difference
{

    public static void deleteCasts()
    {
        //Requires casting
        java.util.List l = new java.util.ArrayList();
        l.add("Hello");
        java.lang.String s = (String) l.get(0);
        System.out.println(l.get(0));

        //Dont require casting
        java.util.List<String> ll = new java.util.ArrayList<String>();
        ll.add("Bye");
        java.lang.String ss = ll.get(0);
        System.out.println(ll.get(0));

    }

    public void pairs()
    {
        java.util.List<Pair<java.lang.Integer, java.lang.Boolean>> l = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            l.add(new Pair<java.lang.Integer, java.lang.Boolean>(i, i%2==0));
            System.out.println(l.get(i));
        }
    }

    public static void main(String[] args)
    {
        Difference d = new Difference();
        d.pairs();
        deleteCasts();

        Box<Integer> inte = new Box<Integer>();
        inte.set(new java.lang.Integer(1));
        System.out.println(inte.get());
        
    }

}

class Box<T>
{
    private T t;

    public void set(T t)
    {
        this.t = t;
    }
    public T get()
    {
        return t;
    }
}

interface P<K,V>
{
    public V getValue();
    public K getKey();
}

class Pair<K,V> implements P<K,V>
{
    private K key;
    private V value;

    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public V getValue()
    {
        return this.value;
    }

    public void setValue(V v)
    {
        this.value = v;
    }

    @Override
    public K getKey()
    {
        return this.key;
    }

    public void setKey(K k)
    {
        this.key = k;
    }

    @Override
    public String toString()
    {
        return String.format("{ Key: %d, Value: %b }\n", this.key, this.value);
    }

}


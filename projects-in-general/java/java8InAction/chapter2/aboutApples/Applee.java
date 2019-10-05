
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Applee
{

    public static void fourthAttempt()
    {
        System.out.println("Getting all the apples that are green: ");
        Apple.filterPrinterApple(Apple.filterApples(randomApples(10), new AppleGreenColorPredicate()), new AppleFancyFormatter());
        System.out.println("Getting all the apples that are heavy: ");
        Apple.filterPrinterApple(Apple.filterApples(randomApples(10), new AppleHeavyWeightPredicate()), new AppleRudeFormatter());
    }

    public static void fifthAttempt()
    {
        System.out.println("Getting all the apples that are green: ");
        Apple.filterPrinterApple(Apple.filterApples(randomApples(10), new ApplePredicate()
            {
                public boolean test(Apple apple)
                {
                    return apple.getW() > 500;
                }
            }), 
        new AppleFormatter()
        {
            public String formatter(Apple apple)
            {
                return String.format("This is an %s apple", "red".equals(apple.getColor()) ? "awesome" : "boring");
            }
        });
    }

    public static void sixthAttempt()
    {
        Apple.filterPrinterApple(
                Apple.filterApples(
                    randomApples(10), (Apple apple) -> "red".equals(apple.getColor())
                ),
            (Apple apple) -> String.format("this is a %s and %s apple", apple.getW() > 500 ? "Heavy" : "light", apple.getColor())
        );
    }

    public static void seventhAttempt()
    {
        printALL(Generic.filter(randomApples(10), (Apple apple) -> "red".equals(apple.getColor())));
    }

    public static java.util.List<Apple> randomApples(int n)
    {
        String[] colors = new String[]{ "red", "green", "blue" };
        java.util.Random rand = new java.util.Random();
        java.util.List<Apple> r = new java.util.ArrayList<Apple>();
        for(int i = 0; i < n; i++)
            r.add(new Apple(colors[rand.nextInt(colors.length)], rand.nextInt(1000)+1));
        return r;   
    }

    public static <T> void printALL(List<T> list)
    {
        for(T t: list)
            System.out.println(t);
    }

    public static void printAllInventory(java.util.List<Apple> l)
    {
        for(Apple a: l)
            System.out.println(a);
    }


    public static void main(String[] args)
    {
        fourthAttempt();
        fifthAttempt();
        sixthAttempt();
        seventhAttempt();
    }

}

interface ApplePredicate
{
    boolean test(Apple apple);
}

interface AppleFormatter
{
    String formatter(Apple apple);
}

interface Predicate<T>
{
    boolean test(T t);
}

class AppleGreenColorPredicate implements ApplePredicate
{
    @Override
    public boolean test(Apple apple)
    {
        return "green".equals(apple.getColor());
    }

}

class AppleHeavyWeightPredicate implements ApplePredicate
{
    @Override
    public boolean test(Apple apple)
    {
        return apple.getW() > 150;
    }
}

class AppleFancyFormatter implements AppleFormatter
{
    @Override
    public String formatter(Apple apple)
    {
        return String.format("This is a %s apple", apple.getW() > 150 ? "heavy" : "light");
    }
}

class AppleRudeFormatter implements AppleFormatter
{
    @Override
    public String formatter(Apple apple)
    {
        return String.format("%d ", apple.getW() > 150 ? apple.getW() : ":(");
    }
}

class Apple
{
    private java.lang.String color;
    private int w;

    public Apple(java.lang.String color, int w)
    {
        this.color = color;
        this.w = w;
    }

    public java.lang.String getColor()
    {
        return this.color;
    }

    public int getW()
    {
        return this.w;
    }

    public static java.util.List<Apple> filterApples(List<Apple> l, ApplePredicate ap)
    {
        java.util.List<Apple> r = new ArrayList<>();
        for(Apple a: l)
            if(ap.test(a))
                r.add(a);
        return r;
    }

    public static void filterPrinterApple(List<Apple> l, AppleFormatter af)
    {
        for(Apple a: l)
            System.out.println(af.formatter(a));
    }



    @Override
    public java.lang.String toString()
    {
        return String.format("Weight: %3d, Color: %s", this.w, this.color);
    }

}

class Generic
{
    public static <T> List<T> filter(List<T> l, Predicate<T> p)
    {
        List<T> r = new ArrayList<T>();
        for(T t: l)
            if(p.test(t))
                r.add(t);
        return r;
    }
}

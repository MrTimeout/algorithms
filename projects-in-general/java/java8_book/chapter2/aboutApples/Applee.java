
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Applee
{

    public static void fourthAttempt()
    {
        System.out.println("Getting all the apples that are green ");
        printAllInventory(Apple.filterApples(randomApples(10)), new AppleGreenColorPredicate());
        

    }

    public static java.util.List<Apple> randomApples(int n)
    {
        String[] colors = new String[]{ "red", "green", "blue" };
        java.util.Random rand = new java.util.Random();
        java.util.List<Apple> r = new java.util.ArrayList<Apple>();
        for(int i = 0; i < n; i++)
            r.add(new Apple(rand.nextInt(1000)+1, colors[rand.nextInt(colors.length)]));
        return r;   
    }

    public static void printAllInventory(java.util.List<Apple> l)
    {
        for(Apple a: l)
            System.out.println(a);
    }


    public static void main(String[] args)
    {

    }

}

interface ApplePredicate
{
    boolean test(Apple apple);
}

class AppleGreenColorPredicate implements ApplePredicate
{
    @Override
    public boolean test(Apple apple)
    {
        return "green".equals(apple.getColor);
    }

}

class AppleHeavyWeightPredicate implements ApplePredicate
{
    @Override
    public boolean test(Apple apple)
    {
        return a.getW() > 150;
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

    @Override
    public java.lang.String toString()
    {
        return String.format("Weight: %3d, Color: %s", this.w, this.color);
    }

}

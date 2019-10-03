
public class Applee
{

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

    @Override
    public java.lang.String toString()
    {
        return String.format("Weight: %3d, Color: %s", this.w, this.color);
    }

}

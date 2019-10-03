
public class Apple
{
    private int weight;
    private String color; 

    public Apple(int w, String c)
    {
        this.weight = w;
        this.color = c;
    }

    public void setWeight(int w)
    {
        this.weight = w;
    }

    public int getWeigth()
    {
        return this.weight;
    }

    public void setColor(String c)
    {
        this.color = c;
    }

    public String getColor()
    {
        return this.color;
    }

    @Override
    public java.lang.String toString()
    {
        return String.format("weight: %3d g, color: %s", this.weight, this.color);
    }

    public static java.util.List<Apple> filterGreenApples(java.util.List<Apple> l)
    {
        java.util.List<Apple> r = new java.util.ArrayList<Apple>();
        for(Apple a: l)
            if("green".equals(a.getColor()))
                r.add(a);
        return r;
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

    public static void main(String[] args)
    {
        java.util.List<Apple> inventory = filterGreenApples(randomApples(10));
        for(Apple a: inventory)
            System.out.println(a);
    }

}


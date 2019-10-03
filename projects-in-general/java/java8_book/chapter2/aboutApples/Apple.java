
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

    public int getWeight()
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

    /**
     * Imagine that the farmer wants to take also the red apples, what could you do??
     * see the next attempt below this method.
     */
    public static java.util.List<Apple> filterGreenApples(java.util.List<Apple> l)
    {
        java.util.List<Apple> r = new java.util.ArrayList<Apple>();
        for(Apple a: l)
            if("green".equals(a.getColor()))
                r.add(a);
        return r;
    }

    public static java.util.List<Apple> filterColorApples(java.util.List<Apple> l, java.lang.String color)
    {
        java.util.List<Apple> r = new java.util.ArrayList<Apple>();
        for(Apple a: l)
            if(color.equals(a.getColor()))
                r.add(a);
        return r;
    }

    public static java.util.List<Apple> filterWeightApple(java.util.List<Apple> l, int weight)
    {
        java.util.List<Apple> r = new java.util.ArrayList<Apple>();
        for(Apple a: l)
            if(a.getWeight() > weight)
                r.add(a);
        return r;
    }

    public static java.util.List<Apple> filterApples(java.util.List<Apple> l, java.lang.String color, int weight, boolean flag)
    {
        java.util.List<Apple> r = new java.util.ArrayList<Apple>();
        for(Apple a: l)
            if((flag && color.equals(a.getColor())) || (!flag && a.getWeight() > weight))
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

    public static void printAllInventory(java.util.List<Apple> l)
    {
        for(Apple a: l)
            System.out.println(a);
    }

    /**
     * This would be the first attempt, where we can create one method to filter by one color and no more...
     */
    public static void firstAttempt()
    {
        java.util.List<Apple> inventory = filterGreenApples(randomApples(10));
        for(Apple a: inventory)
            System.out.println(a);
    }

    /**
     * This would be the second attempt, where we can filter by any color that the farmer wants:
     * Now, imagine that the farmer wants to add other filter like the weight, you could do another method with this filter
     */
    public static void secondAttempt()
    {
        java.util.List<Apple> greenInventory = filterWeightApple(filterColorApples(randomApples(10), "green"), 150);
        printAllInventory(greenInventory);
        java.util.List<Apple> redInventory = filterWeightApple(filterColorApples(randomApples(10), "red"), 150);
        printAllInventory(redInventory);
    }

    /**
     * This would be the third attempt, where we can filter by color or weight using only one method...
     */
    public static void thirdAttempt()
    {
        java.util.List<Apple> greenInventory = filterApples(randomApples(10), "green", 150, false);
        printAllInventory(greenInventory);
        java.util.List<Apple> weightInventory = filterApples(randomApples(10), "green", 150, true);
        printAllInventory(weightInventory);
    }

    public static void main(String[] args)
    {
        thirdAttempt(); 
    }

}


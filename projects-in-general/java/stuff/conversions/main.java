package conversions;

public class Main
{
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(args);
        }
    }
}

private class Base
{

    private int b;
    private String num;

    public Base(int b, String num)
    {
        this.b = b;
        this.num = num;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int getB()
    {
        return this.b;
    }

    public void setNum(String num)
    {
        this.num = num;
    }

    public String getNum()
    {
        return this.num;
    }

}


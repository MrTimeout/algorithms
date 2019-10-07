
public class InputStreamExamples
{
   
    public static void readingAll() throws java.io.IOException
    {
        java.io.InputStream input = null;
        try
        {
            input = new java.io.FileInputStream("test.txt");
            int data;
            while((data=input.read()) != -1)
                System.out.printf("%c", data);
        }
        catch(java.io.IOException e)
        {

        }
        finally
        {
            if(input != null)
                input.close();
        }
    }

    public static void allMethodsOfInputStream() throws java.io.IOException
    {
        java.io.InputStream input = null;
        int data, amount;
        byte[] buffer = new byte[50];
        java.util.List<Byte> bytes;
        try
        {
            input = new java.io.FileInputStream("test.txt"); 

            System.out.printf("Bytes that are available to read are: %d \n", input.available());

            if(input.markSupported())
            {
                input.mark(0);
                System.out.println("We are marking the first position in the input stream to come back later");
            }
            else
                System.out.println("This java.io.InputStream doesnt support the reset and mark method");

            System.out.println("Reading only the first line: ");
            amount = 0;
            while((data = input.read()) != '\n' && data != -1)
            {
                amount++;
                System.out.printf("%c", data);
            }
            System.out.println("We reset to the first character of the InputStream");
            if(input.markSupported())
                input.reset();
            else
                System.out.println("Mark is not supported");
            
            if(input.markSupported())
            {
                System.out.printf("We are skipping the first line, an amount of %d bytes\n", amount);
                input.skip((long) amount);
            }

            System.out.println("We are going to read the next line because we know the length");
            input.read(buffer, 0, 5);

            Garbage.<Byte>printList(
                    Garbage.<Byte>toList(
                        Garbage.toByte(buffer)
                        ),
                    (Byte b) -> { byte v; if((v=b.byteValue())!=0) System.out.printf("%c -> %d\n", v, v); }
                    );

            System.out.printf("There are available %d bytes\n", input.available());
        }
        catch(java.io.IOException e)
        {

        }
        finally
        {
            if(input != null)
                input.close();
        }
    }

    public static <T> void printArr(java.util.List<T> arg, Consumer<T> c)
    {
        for(T t: arg)
            c.accept(t);
        System.out.println("");
    }

    public static void main(String... args) throws java.io.IOException
    {
        readingAll();
        allMethodsOfInputStream();
    }

}

@FunctionalInterface
interface Consumer<T>
{
    void accept(T t);
}

class Garbage
{
    
    public static <T> java.util.List<T> toList(T[] arg)
    {
        java.util.List<T> l = new java.util.ArrayList<T>();
        for(T t: arg)
            l.add(t);
        return l;
    }

    public static <T> void printList(java.util.List<T> list, Consumer<T> c)
    {
        for(T t: list)
            c.accept(t);
    }

    public static Byte[] toByte(byte[] arr)
    {
        java.lang.Byte[] b = new java.lang.Byte[arr.length];
        for(int i = 0; i < arr.length; i++)
            b[i] = new java.lang.Byte(arr[i]);
        return b;
    }

}


/**
 * - java.io.InputStream
 *
 *      - java.io.ByteArrayInputStream extends java.io.InputStream
 *
 *      - java.io.FileInputStream extends java.io.InputStream
 *
 *      - java.io.PipedInputStream extends java.io.InputStream
 *
 *      - java.io.BufferedInputStream extends java.io.InputStream
 *
 *      - java.io.FilterInputStream extends java.io.InputStream
 *
 *      - java.io.PushbackInputStream extends java.io.InputStream
 *
 *      - java.io.DataInputStream extends java.io.InputStream
 *
 *      - java.io.ObjectInputStream extends java.io.InputStream
 *
 *      - java.io.SequenceInutStream extends java.io.InputStream
 */ 

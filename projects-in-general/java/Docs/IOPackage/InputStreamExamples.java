
public class InputStreamExamples
{
   
    public static void readingAll() throws java.io.IOException
    {
        java.io.InputStream input = new java.io.FileInputStream("test.txt");
        try
        {
            int data;
            while((data=input.read()) != -1)
                System.out.printf("%c", data);
        }
        catch(java.io.IOException e)
        {

        }
    }

    public static void main(String... args) throws java.io.IOException
    {
        readingAll();
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
 */ 

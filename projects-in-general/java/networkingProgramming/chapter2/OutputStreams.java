
public class OutputStreams
{

    public static void generateCharacters(java.io.OutputStream out) throws java.io.IOException
    {
       int min = 33;
       int amount = 94;
       int seq = 72;

       int start = min;
       while(true)
       {
           for(int i = start; i < start+seq; i++)
               out.write((i-min)%amount + min);
           out.write('\r');
           out.write('\n'); 
           start = ((start+1-min)%amount + min);
       }
    }

    public static void main(String... args)
    {
        try {
            generateCharacters(new java.io.FileOutputStream("characters.txt")); 
        } catch(java.io.IOException e) {
            e.printStackTrace();
        }
    }

}

/**
 *
 * We have an abstract class who name is java.io.OutputStream
 *
 * public abstract class java.io.OutputStream 
 * {
 *      public abstract void write(int b) throws IOException
 *      public void write(byte[] data) throws IOException
 *      public void write(byte[] data, int offset, int length) throws IOException
 *      public void flush() throws IOException
 *      public void close() throws IOException
 * }
 *
 */ 


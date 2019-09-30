
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream
{
    public static void main(String[] args)
    {
        try
        {
            // ByteStreams.copy();
            InStream.overview("file.txt");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}

class ByteStreams
{

    public static void copy() throws IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;

        try
        {
            in = new FileInputStream("file.txt");
            out = new FileOutputStream("file-backup.txt");
            int c;
            while((c = in.read()) != -1)
                out.write(c);
        } 
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            if(in != null)
                in.close();
            if(out != null)
               out.close(); 
        }
    }
}

class InStream
{

    public static void overview(java.lang.String path) throws IOException
    {
         if(path.isEmpty() || path.trim().isEmpty())
             throw new IOException("Error parsing the path value");

         FileInputStream in = null;
         int code;
         long skipped;
         try
         {
            in = new FileInputStream(path);
            byte[] buff = new byte[10];
            if((code=in.read(buff))!= -1)
                for(byte b: buff)
                    System.out.printf("%c(%d) ", b, b);
            System.out.println("\n------");
            if((code=in.read(buff, 0, buff.length-1)) != -1)
                for(byte b: buff)
                    System.out.printf("%c(%d) ", b, b);
            System.out.println("\n------");
            if((code=in.read()) != -1)
                System.out.println(String.format("%c(%d)", code, code));
            if((skipped=in.skip((long)2)) != -1)
                System.out.println(String.format("Skipping: %d", skipped));
            if((code=in.available()) > 5)
                System.out.println(String.format("Available: %d", code));
         }
         catch(IOException e)
         {
            System.out.println(e);
         }
         finally
         {
            if(in != null)
                in.close();
         }
    }
    
}


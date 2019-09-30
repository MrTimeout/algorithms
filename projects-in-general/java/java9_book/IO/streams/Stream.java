
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream
{
    public static void main(String[] args)
    {
        try
        {
            ByteStreams.copy();
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


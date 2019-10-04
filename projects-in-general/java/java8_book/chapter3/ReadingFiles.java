
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles
{

    public static String processFile() throws IOException
    {
        try(BufferedReader br = new BufferedReader(new FileReader("Threads.java")))
        {
            br.readLine();
            return br.readLine();
        }
    }

    public static String processFilee(BufferedReaderProcessor brp) throws IOException
    {
        try(BufferedReader br = new BufferedReader(new FileReader("Threads.java")))
        {
            return brp.read(br);
        }
    }
    
    public static void main(String[] args)
    {
        try 
        {
            System.out.println(processFile());
            System.out.println(processFilee((BufferedReader br) -> { br.readLine(); return br.readLine(); }));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

}

@FunctionalInterface
interface BufferedReaderProcessor
{
    String read(BufferedReader br) throws IOException;
}

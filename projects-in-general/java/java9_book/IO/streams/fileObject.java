
import java.io.File;

public class fileObject
{

    public static parsingFile(String name)
    {
        java.io.File f = new java.io.File(name);
        if(f.exists())
        {
            System.out.println(String.format("It can be executed: %b\nIt can be readed: %b\nIt can be wrote: %b\n", f.canExecute(), f.canRead(), f.canWrite()));
        } 
    }

    public static void main(String[] args)
    {
        for(String str: args)
            parsingFiles();
    }

}

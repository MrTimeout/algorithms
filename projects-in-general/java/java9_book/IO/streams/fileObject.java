
import java.io.File;

public class fileObject
{

    private static java.io.File c = new java.io.File("new.txt");

    public static void parsingFile(java.lang.String name)
    {
        java.io.File f = new java.io.File(name);
        if(f.exists())
        {
            System.out.println(String.format("It can be executed: %b\nIt can be readed: %b\nIt can be wrote: %b\n", f.canExecute(), f.canRead(), f.canWrite()));
             switch(f.compareTo(c))
             {
                case 0:
                    System.out.println("Exactly the same");
                break;
                case 1:
                    System.out.printf("%s greater than %s\n", toString(f), toString(c));
                break;    
                case -1:
                    System.out.printf("%s less than %s\n", toString(f), toString(c));
                break;
             }
             System.out.println(toString(f));
        } 
    }

    public static void main(String[] args)
    {
        for(String str: args)
            parsingFile(str);
    }

    public static java.lang.String toString(java.io.File f)
    {
        return String.format("\n{\n\t'AbsolutePath': %s,\n\t'Name': %s,\n\t'Parent': %s,\n\t'Path': %s,\n}",
                             f.getAbsolutePath(),
                             f.getName(),
                             f.getParent(),
                             f.getPath());
    }

u

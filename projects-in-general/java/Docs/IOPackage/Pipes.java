
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Pipes
{

    public static void example_1() throws java.io.IOException
    {
        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream input = new PipedInputStream(output);

        Thread thread1 = new Thread(() -> { 
                try
                {
                    output.write("Hello world, pipe!".getBytes());
                }
                catch(IOException e)
                {
                    System.out.println(e);
                }
         }
         );

        Thread thread2 = new Thread(() -> {
            try
            {
                int data;
                while((data=input.read()) != -1)
                    System.out.println((char) data);
            }
           catch(IOException e)
           {
                System.out.println(e);
           } 
        });

        thread1.start();
        thread2.start();

    } 

    public static void main(String... args) throws java.io.IOException
    {
        example_1();
    }

}


@FunctionalInterface
interface Runnable
{
    void run();
}


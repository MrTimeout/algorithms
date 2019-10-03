
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Product
{
    private Long id;
    private String name;

    public Product()
    {

    }

    public Long getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }
    
    public void setId(Long id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        String.format("Id: %d, Name: %s", this.id, this.name);
    }

    public static void main(String[] args)
    {
        
    }

}

class HttpClient
{
    public String get(String url) throws IOException
    {
        URL url = new URL(url);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(8000);
        return this.read(con.getInputStream())
    }

    public Object 
}


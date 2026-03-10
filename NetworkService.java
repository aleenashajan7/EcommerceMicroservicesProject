import java.net.*;
import java.io.*;

public class NetworkService {

    public static void inetDemo() throws Exception{

        InetAddress ip=InetAddress.getByName("google.com");

        System.out.println("Host "+ip.getHostName());
        System.out.println("IP "+ip.getHostAddress());
    }

    public static void urlDemo() throws Exception{

        URL url=new URL("https://example.com");

        URLConnection conn=url.openConnection();

        BufferedReader br=new BufferedReader(
                new InputStreamReader(conn.getInputStream()));

        System.out.println(br.readLine());

        br.close();
    }
}
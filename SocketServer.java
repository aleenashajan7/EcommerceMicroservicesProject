import java.net.*;
import java.io.*;

public class SocketServer {

    public static void main(String[] args) throws Exception{

        ServerSocket server=new ServerSocket(5000);

        System.out.println("Server Started");

        Socket socket=server.accept();

        BufferedReader in=
        new BufferedReader(
        new InputStreamReader(socket.getInputStream()));

        System.out.println("Client: "+in.readLine());

        socket.close();
        server.close();
    }
}
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
        System.out.println("Server started...");

        Socket socket = server.accept();
        System.out.println("Client connected!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String msg;

        while ((msg = in.readLine()) != null) {
            System.out.println("Client: " + msg);
            System.out.print("You: ");
            out.println(console.readLine());
        }
    }
}

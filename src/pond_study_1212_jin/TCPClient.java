import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        // Create client socket object
        Socket socket = new Socket("localhost", 5000);

        // Send message to server
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello from client");

        // Read response from server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = in.readLine();
        System.out.println("Message from server: " + message);

        // Close streams and socket
        in.close();
        out.close();
        socket.close();
    }
}
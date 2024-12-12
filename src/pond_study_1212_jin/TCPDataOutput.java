import java.net.*;
import java.io.*;

public class TCPDataOutput {
    public static void main(String[] args) throws IOException {
        String hostname = "localhost";
        int port = 8080;
        
        try (Socket socket = new Socket(hostname, port)) {
        OutputStream output = socket.getOutputStream();
        String message = "This is a test message";
        output.write(message.getBytes());
        }
    }
}
import java.net.*;
import java.io.*;

// public class TCPerver {
//     public static void main(String[] args) throws IOException {
        
//         // create server socket object
//         ServerSocket serverSocket = new ServerSocket(5000);

//         // Wait for client connection
//         System.out.println("Waiting for client request...");
//         Socket ClienSocket = serverSocket.accept();
//         System.out.println("Connected to client");

//         // Read message from client
//         BufferedReader in = new BufferedReader(new 
//         InputStreamReader(ClienSocket.getInputStream()));
//         String message = in.readLine();
//         System.out.println("Message from client: " + message);

//         // Send response to client
//         PrintWriter out = new PrintWriter(ClienSocket.getOutputStream(), true);
//         out.println("Response from server");

//         // Close streams and sockets
//         in.close();
//         out.close();
//         ClienSocket.close();
//         serverSocket.close();
//     }
// }


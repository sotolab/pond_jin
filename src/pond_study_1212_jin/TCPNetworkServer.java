import java.net.*;
import java.io.*;

public class TCPNetworkServer {
	public static void main(String[] args) {
		try {
			 // Create a server socket
			 ServerSocket server = new ServerSocket(1234);
			 
			 // Wait for a client to connect
			 Socket client = server.accept();
			 
			 // Create an input stream to receive data from the client
			 InputStream in = client.getInputStream();
			 
			 // Create a buffer to read the data into
			 byte[] buffer = new byte[1024];
			 
			 // Read the data into the buffer
			 int bytesRead = in.read(buffer);
			 
			 // Convert the buffer to a string
			 String message = new String(buffer, 0, bytesRead);
			 
			 // Output the message
			 System.out.printIn("Received message: " + message);
			 
			 // Close the input stream, client socket, and server socket
			 in.close();
			 client.close();
			 server.close();
		 } catch (Exception e) {
		   e.printStackTrace();
		 }
	 }
}
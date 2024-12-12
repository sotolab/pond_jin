import java.net.*;
import java.io.*;

public class TCPNetworkClient {
	public static void main(String[] args) {
		try {
			 // Open a socket on the server
			 Socket socket = new Socket("127.0.0.1", 1234);
			 
			 // Create an output stream to send data to the server
			 OutputStream out = socket.getOutputStream();
			 
			 // Send a message to the server
			 String message = "Hellow, server!",
			 out.write(message.getBytes());
			 
			 // Close the output stream and the socket
			 out.close();
			 socket.close();
		 } catch (Exception e) {
		   e.printStackTrace();
		 }
	 }
}
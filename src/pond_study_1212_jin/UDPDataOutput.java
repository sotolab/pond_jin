import java.net.*;
import java.io.*;

public class UDPDataOutput {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        byte[] sendData = "This is a test message".getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData,
        sendData.length, address, 8080);
        socket.send(sendPacket);        
    }
}

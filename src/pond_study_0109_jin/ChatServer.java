import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("서버가 시작되었습니다. 클라이언트를 기다리는 중...");
            
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("클라이언트가 연결되었습니다.");

                new Thread(() -> {
                    try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                         PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
                         
                        String message;
                        while ((message = in.readLine()) != null) {
                            System.out.println("클라이언트: " + message);
                            out.println("서버: " + message);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

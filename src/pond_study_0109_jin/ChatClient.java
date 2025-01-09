import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             Scanner scanner = new Scanner(System.in)) {
             
            System.out.println("서버에 연결되었습니다. 메시지를 입력하세요.");

            new Thread(() -> {
                try {
                    String response;
                    while ((response = in.readLine()) != null) {
                        System.out.println(response);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            while (true) {
                String userInput = scanner.nextLine();
                out.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

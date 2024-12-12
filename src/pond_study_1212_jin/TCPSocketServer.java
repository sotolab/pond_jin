public class TCPSocketServer  {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);// create server socket on port 8000
            System.out.println("Server started at " + new java.util.Date());

            while (true) {
                Socket clientSocket = serverSocket.accept();// listen for a connection request
                InetAddress clInetAddress = clientSocket.getInetAddress();
                init clientPort = clientSocket.getPort();
                System.out.println("Client IP: " + clInetAddress.getHostAddress() + " Port: " + clientPort);

                // send welcome message to client
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                out.println("Welcome to the server");
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
}
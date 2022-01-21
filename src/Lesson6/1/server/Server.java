package Lesson6.number1.server;

import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;

        //start server
        try {
            server = new ServerSocket(9000);
            System.out.println("Server created. Waiting for client...");
            //client connection monitoring
            while (true) {
                socket = server.accept();
                System.out.println("Client connected");
                new Thread(new Lesson6.number1.server.ClientHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                server.close();
                System.out.println("Server closed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
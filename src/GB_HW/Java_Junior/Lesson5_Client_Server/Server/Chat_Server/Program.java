package GB_HW.Java_Junior.Lesson5_Client_Server.Server.Chat_Server;


import java.io.IOException;
import java.net.ServerSocket;

public class Program {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(1600);
            Server server = new Server(serverSocket);
            server.runServer();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

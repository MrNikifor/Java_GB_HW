package GB_HW.Java_Junior.Lesson5_Client_Server.Client.Chat_server;

import GB_HW.Java_Junior.Lesson5_Client_Server.Client.Chat_server.Client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();


        try {
            InetAddress address = InetAddress.getLocalHost();
            Socket socket = new Socket(address, 1600);
            Client client = new Client(socket, name);

            System.out.println("InetAddress: " + socket.getInetAddress());
            System.out.println("Remote IP: " + socket.getInetAddress().getHostAddress());
            System.out.println("LocalPort: " + socket.getLocalPort());

            System.out.println("Для отправки личного сообщения используйте $Имя:Сообщение");
            System.out.println("Для выхода из чата введите: выход");

            client.listenForMessage();
            client.sendMessage();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
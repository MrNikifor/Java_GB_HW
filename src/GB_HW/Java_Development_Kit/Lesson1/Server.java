package GB_HW.Java_Development_Kit.Lesson1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Server {
    private static List<PrintWriter> clients = new ArrayList<>();
    private static List<String> chatHistory = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Сервер запущен. Ожидание подключений...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Клиент подключен.");

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                clients.add(out);

                // Отправляем историю чата клиенту
                sendChatHistory(out);

                // Обработка сообщений от клиента
                new Thread(() -> {
                    try {
                        Scanner in = new Scanner(clientSocket.getInputStream());
                        while (in.hasNextLine()) {
                            String message = in.nextLine();
                            chatHistory.add(getCurrentTimeStamp() + " Клиент: " + message);
                            broadcastMessage(message);
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

    private static void broadcastMessage(String message) {
        for (PrintWriter client : clients) {
            client.println(getCurrentTimeStamp() + " " + message);
        }
    }

    private static void sendChatHistory(PrintWriter client) {
        for (String message : chatHistory) {
            client.println(message);
        }
    }

    private static String getCurrentTimeStamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }
}
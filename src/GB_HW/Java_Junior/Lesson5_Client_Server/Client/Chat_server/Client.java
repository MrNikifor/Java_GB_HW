package GB_HW.Java_Junior.Lesson5_Client_Server.Client.Chat_server;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private final Socket socket;

    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    private final String name;

    public Client(Socket socket, String name) {
        this.socket = socket;
        this.name = name;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        } catch (IOException e) {
            closeEverything(socket, bufferedWriter, bufferedReader);
        }
    }

    /**
     * Слушатель для всех входящих сообщений.
     */
    public void listenForMessage() {
        new Thread(() -> {
            String message;
            while (socket.isConnected()) {
                try {
                    message = bufferedReader.readLine();
                    System.out.println(message);
                } catch (IOException e) {
                    closeEverything(socket, bufferedWriter, bufferedReader);
                }
            }
        }).start();
    }

    /**
     * Отправка сообщений.
     */
    public void sendMessage(){

        try {
            bufferedWriter.write(name);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            Scanner scanner = new Scanner(System.in);
            while (socket.isConnected()){
                String message = scanner.nextLine();

                // Выход из чата
                if (message.equals("выход")){
                    closeEverything(socket, bufferedWriter, bufferedReader);
                    System.out.println("Вы были отключены от сервера.");
                }

                bufferedWriter.write(name + ": " + message);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }catch (IOException e){
            closeEverything(socket, bufferedWriter, bufferedReader);
        }
    }

    /**
     * Завершение работы всех потоков, закрытие клиентского сокета.
     *
     * @param socket клиентский сокет.
     * @param writer буфер для отправки данных.
     * @param reader буфер для чтения данных.
     */
    private void closeEverything(Socket socket, BufferedWriter writer, BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

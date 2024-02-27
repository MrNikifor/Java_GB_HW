package GB_HW.Java_Junior.Lesson5_Client_Server.Server.Chat_Server;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.UUID;

public class ClientManager implements Runnable{

    private Socket socket;

    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    private String name;

    private String id;

    public static ArrayList<ClientManager> clients = new ArrayList<>();

    public ClientManager(Socket socket) {
        try {
            this.socket = socket;
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            name = bufferedReader.readLine();
            id = UUID.randomUUID().toString();
            clients.add(this);
            System.out.println(name + " подключился к чату.");
            broadcastMessage("Server: " +  name + " подключился к чату.");


        }catch (IOException e){
            closeEverything(socket, bufferedWriter, bufferedReader);
        }
    }

    /**
     * Завершение работы всех потоков, закрытие соединения с клиентским сокетом,
     * удаление клиентского сокета из коллекции.
     * @param socket клиентский сокет.
     * @param writer буфер для записи данных.
     * @param reader буфер для чтения данных.
     */
    private void closeEverything(Socket socket, BufferedWriter writer, BufferedReader reader){
        removeClient();
        try {
            if (reader != null){
                reader.close();
            }
            if (writer != null){
                writer.close();
            }
            if (socket != null){
                socket.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Удаление сокета клиента из коллекции.
     */
    private void removeClient(){
        clients.remove(this);
        System.out.println(name + " покинул чат.");

    }

    @Override
    public void run() {
        String messageFromClient;
        while (socket.isConnected()){
            try{
                messageFromClient = bufferedReader.readLine();
                // Проверяем, содержит ли сообщение знак приватности
                if(checkPrivateMessage(messageFromClient)){
                    // Отправляем приватное сообщение
                    sendPrivateMessage(messageFromClient);
                }else {
                    // Отправляем общее сообщение
                    broadcastMessage(messageFromClient);
                }

            }catch (IOException e){
                closeEverything(socket, bufferedWriter, bufferedReader);
                break;
            }
        }
    }

    private void broadcastMessage(String message){
        for (ClientManager client : clients){
            try {
                if (!client.id.equals(id)){
                    client.bufferedWriter.write(message);
                    client.bufferedWriter.newLine();
                    client.bufferedWriter.flush();
                }
            }catch (IOException e){
                closeEverything(socket, bufferedWriter, bufferedReader);
            }
        }
    }

    /**
     * Отправка приватного сообщения пользователю.
     * @param message сообщение
     */
    private void sendPrivateMessage(String message){
        // Ищем индекс знака приватного сообщения
        int indexDelimiterStart = message.indexOf("$");
        // Ищем делитель ':' - тем самым находим имя клиента в сообщении
        int indexDelimiterFinish = message.indexOf(":", indexDelimiterStart);
        // Проверяем что получены корректные индексы
        if(indexDelimiterStart > 0 && indexDelimiterFinish > 0) {
            // Сохраняем имя клиента
            String nameClient = message.substring(
                    indexDelimiterStart + 1, indexDelimiterFinish);
            // Получаем сообщение для клиента
            String privateMessage = message.substring(0, indexDelimiterStart)
                    + message.substring(indexDelimiterFinish + 1).strip();
            // Рассылаем сообщение клиентам с указанным именем.
            for (ClientManager client : clients) {
                try {
                    if (client.name.equals(nameClient)) {
                        client.bufferedWriter.write(privateMessage);
                        client.bufferedWriter.newLine();
                        client.bufferedWriter.flush();
                    }
                } catch (IOException e) {
                    closeEverything(socket, bufferedWriter, bufferedReader);
                }
            }
        }
    }

    /**
     * Проверяем является ли сообщение приватным.
     * @param message сообщение
     * @return true при наличии знака приватности, иначе false.
     */
    private boolean checkPrivateMessage(String message){
        int indexDelimiter = message.indexOf(':');
        return message.length() > indexDelimiter + 2
                && message.charAt(indexDelimiter + 2) == '$';
    }
}
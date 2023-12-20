package GB_HW.Java_Development_Kit.Lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static JTextArea chatArea;
    private static JTextField messageField;

    private static BufferedWriter logWriter;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Клиент");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chatArea = new JTextArea(10, 40);
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        frame.getContentPane().add(scrollPane);

        messageField = new JTextField(20);
        messageField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        frame.getContentPane().add(messageField);

        JButton sendButton = new JButton("Отправить");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        frame.getContentPane().add(sendButton);

        frame.pack();
        frame.setVisible(true);

        connectToServer();
    }

    private static void connectToServer() {
        try {
            Socket socket = new Socket("localhost", 12345);
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Запрашиваем историю чата
            requestChatHistory(out);

            // Обработка сообщений от сервера
            while (in.hasNextLine()) {
                String message = in.nextLine();
                chatArea.append(message + "\n");
                logMessage(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sendMessage() {
        String message = messageField.getText();
        chatArea.append("Вы: " + message + "\n");
        logMessage("Вы: " + message);
        messageField.setText("");

        // Отправляем сообщение на сервер
        // Здесь необходимо добавить код для отправки сообщения на сервер
    }

    private static void requestChatHistory(PrintWriter out) {
        // Отправляем запрос на получение истории чата
        out.println("/history");
    }

    private static void logMessage(String message) {
        // Записываем сообщение в файл
        try {
            logWriter = new BufferedWriter(new FileWriter("chat_log.txt", true));
            logWriter.write(message + "\n");
            logWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
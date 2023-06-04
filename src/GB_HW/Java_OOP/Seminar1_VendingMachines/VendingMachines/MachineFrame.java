package GB_HW.Java_OOP.Seminar1_VendingMachines.VendingMachines;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class MachineFrame extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;


    JLabel lbWelcome;

    public void initialize() {


        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);


        JLabel lbLastName = new JLabel("First Name");
        lbLastName.setFont(mainFont);



        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);



        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);


        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);



        JButton btnOk = new JButton("Ok");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                String firstName = tfFirstName.getText();
                String lastName = tfFirstName.getText();
                lbWelcome.setText("Hello " + firstName + " " + lastName);


            }

        });


        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tfFirstName.setText("");
                tfFirstName.setText("");
                lbWelcome.setText("");

            }

        });


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
        buttonPanel.add(btnClear);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(3, 107, 251));

        mainPanel.add(formPanel, BorderLayout.NORTH);


        mainPanel.add(lbWelcome, BorderLayout.CENTER);


        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        add(mainPanel);


        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);


        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] arg)
    {
        MachineFrame myFrame = new MachineFrame();
        myFrame.initialize();
    }
}
/*
    Привязывание кнопки на JFrame в Java можно выполнить с помощью интерфейса ActionListener. Для этого необходимо создать экземпляр класса JButton и добавить его на JFrame. Затем создать экземпляр класса ActionListener и привязать его к кнопке с помощью метода addActionListener.
        Например, создадим кнопку "Нажми меня" и привяжем к ней действие, которое будет выводить сообщение на консоль:
        ```
        import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener {

    public MyFrame() {
        // Создание кнопки
        JButton button = new JButton("Нажми меня");
        // Привязка действия к кнопке
        button.addActionListener(this);
        // Добавление кнопки на JFrame
        add(button);
        // Настройка параметров JFrame
        setTitle("Моя программа");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Реализация метода actionPerformed интерфейса ActionListener
    public void actionPerformed(ActionEvent e) {
        System.out.println("Кнопка нажата");
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
```
        Другой способ привязки кнопки к действию - использование анонимного класса, реализующего интерфейс ActionListener. Например, создадим кнопку "Выход" и привяжем к ней действие, которое будет закрывать программу:
        ```
        import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;
public class MyFrame extends JFrame {

    public MyFrame() {
        // Создание кнопки
        JButton button = new JButton("Выход");
        // Привязка действия к кнопке
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // Добавление кнопки на JFrame
        add(button);
        // Настройка параметров JFrame
        setTitle("Моя программа");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
```
        Также можно использовать лямбда-выражения для привязки действий к кнопке. Например, создадим кнопку "Сообщение" и привяжем к ней действие, которое будет выводить сообщение на экран:
        ```
        import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;
public class MyFrame extends JFrame {

    public MyFrame() {
        // Создание кнопки
        JButton button = new JButton("Сообщение");
        // Привязка действия к кнопке
        button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Привет, мир!"));
        // Добавление кнопки на JFrame
        add(button);
        // Настройка параметров JFrame
        setTitle("Моя программа");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
```*/

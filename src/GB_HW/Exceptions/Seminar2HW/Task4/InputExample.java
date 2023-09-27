package GB_HW.Exceptions.Seminar2HW.Task4;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку (для выхода введите 'exit'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                checkForEmptyString(input);
                System.out.println("Вы ввели: " + input);
            } catch (EmptyStringException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static void checkForEmptyString(String input) throws EmptyStringException {
        if (input.trim().isEmpty()) {
            throw new EmptyStringException("Нельзя вводить пустые строки.");
        }
    }
}

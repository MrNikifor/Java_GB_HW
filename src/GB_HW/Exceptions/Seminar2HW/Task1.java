package GB_HW.Exceptions.Seminar2HW;

import java.util.Scanner;

//  Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
//        необходимо повторно запросить у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
        float userFloat = getFloatFromUser();
        System.out.println("Вы вошли: " + userFloat);
    }

    public static float getFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Введите дробное значение: ");
            String input = scanner.nextLine();
            try {
                result = Float.parseFloat(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!!! Пожалуйста, введите допустимое значение с плавающей " +
                        "точкой и не тупи!!!.");
            }
        }
        return result;
    }
}

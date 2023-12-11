package GB_HW.Java_Core.Lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Получаем начальный баланс от пользователя
            System.out.print("Введите начальный баланс счета: ");
            double initialBalance = scanner.nextDouble();
            Account account = new Account(initialBalance);

            // Вносим депозит
            System.out.print("Введите сумму депозита: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            // Снимаем средства
            System.out.print("Введите сумму для снятия: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);

            // Попытка снять больше, чем есть на счете
            System.out.print("Введите сумму для снятия (больше текущего баланса): ");
            double withdrawExcessiveAmount = scanner.nextDouble();
            account.withdraw(withdrawExcessiveAmount);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

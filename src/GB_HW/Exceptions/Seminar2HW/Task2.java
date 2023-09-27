package GB_HW.Exceptions.Seminar2HW;
// Если необходимо, исправьте данный код:
//        try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }

public class Task2 {
    public static void main(String[] args) {
//        1)Деление на ноль: В строке double catchedRes1 = intArray[8] / d; есть потенциальное деление на ноль
//        (d имеет значение 0). Это вызовет исключение ArithmeticException. Рекомендуется избегать деления на ноль,
//        либо обрабатывать это исключение более подробно.
//        2)Использование неинициализированных переменных: Переменная intArray не была инициализирована в данном коде.
//        Это может вызвать ошибку компиляции.

        try {
            int[] intArray = {10, 20, 30};  // Инициализация массива

            int d = 2;  // Избегаем деления на ноль
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching arithmetic exception: " + e);
        }
    }
}

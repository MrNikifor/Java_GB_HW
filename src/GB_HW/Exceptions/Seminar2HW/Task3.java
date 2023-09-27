package GB_HW.Exceptions.Seminar2HW;
/*
Дан следующий код, исправьте его там, где требуется:

public static void main(String[] args) throws Exception {
        try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[3] = 9;
        } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
        }
        }
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
        }
*/

import java.io.FileNotFoundException;

public class Task3 {
//    1)Исправлено исключение, на которое ожидается реакция в блоке catch при делении на ноль и других арифметических ошибках.
//    2)Метод printSum больше не бросает FileNotFoundException, так как он не работает с файлами.
//    Убрано объявление бросания исключения throws FileNotFoundException из метода printSum.
//    3)Исправлено обращение к элементу массива, чтобы избежать ArrayIndexOutOfBoundsException.
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            // Исправлено: Используется правильный индекс для массива
            abc[1] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль или другая арифметическая ошибка.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Индекс массива выходит за его пределы.");
        } catch (Exception ex) {
            System.out.println("Произошло что-то непредвиденное.");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}


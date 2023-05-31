package GB_HW.Java_API.Seminar1;

import java.util.Scanner;
/*
Задание:
1)Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
2)Вывести все простые числа от 1 до 1000
3)Реализовать простой калькулятор
4*) +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
*/
public class Task1_and_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int triangleNumber = sc.nextInt();
        int number = sc.nextInt();
        System.out.println(getTriangleNumber(triangleNumber));
        System.out.println(getFactorial(number));
        sc.close();
    }
    // Задание 1
    private static int getTriangleNumber(int n){
        return n * (n + 1) / 2;
    }
    // Задание 1.2
    private static int getFactorial(int a){
        int sum = 1;
        if(a == 0 || a == 1){
            return 1;
        }
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }
    // Задание 1.2 (до решение)
    //TODO: Решение факториала рекурсивным методом

    /**   static int factorial(int x){

     if (x == 1){

     return 1;
     }
     return x * factorial(x - 1);
     }**/
    // Задание 2
    private static void simpleNumber() {
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

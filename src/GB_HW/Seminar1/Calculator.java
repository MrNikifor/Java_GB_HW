package GB_HW.Seminar1;
//3)Реализовать простой калькулятор
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int number1;
        int number2;
        int answer;
        String oper;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        System.out.println("\nВведите оператор ('+', '-', '*','/'): ");
        oper = sc.next();
        switch (oper){
            case "+": answer = number1 + number2;
                break;
            case "-": answer = number1 - number2;
                break;
            case "*": answer = number1 * number2;
                break;
            case "/": answer = number1 / number2;
                break;
            default:
                System.out.println("Ошбка! Вы ввели неверный символ: \n");
                return;
        }
        System.out.println("Ваш результат: ");
        System.out.println(answer);
    }
}

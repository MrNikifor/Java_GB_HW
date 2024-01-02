package GB_HW.Java_Development_Kit.Lesson3;

import GB_HW.Java_Development_Kit.Lesson3.Task1.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============  Здание 1  ===============");
        System.out.printf("2 + 3.7 = %.2f\n", Calculator.sum(2, 3.7));
        System.out.printf("10 / 2.5 = %.2f\n", Calculator.divide(10, 2.5));
        try {
            Calculator.divide(10, 0.0);
        } catch (RuntimeException e) {
            System.out.printf("10 / 0 = %s\n", e.getMessage());
        }
        System.out.printf("2.5 * 4 = %.2f\n", Calculator.multiply(2.5, 4));
        System.out.printf("8 - 5 = %.2f\n", Calculator.subtract(8, 5));

    }
}
package GB_HW.Seminar3;

import java.util.ArrayList;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }

        numbers.clear();
        numbers.addAll(oddNumbers);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}

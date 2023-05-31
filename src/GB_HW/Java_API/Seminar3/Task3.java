package GB_HW.Java_API.Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(18);
        numbers.add(3);
        numbers.add(7);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double avg = (double) sum / numbers.size();

        System.out.println("Max: "  + max);
        System.out.println("Min: "  + min);
        System.out.println("Avg: "  + avg);
    }
}

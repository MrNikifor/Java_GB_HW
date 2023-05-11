import java.util.*;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"
        );

        Map<String, Integer> nameCount = new HashMap<>();

        // Подсчет повторений имен
        for (String employee : employees) {
            nameCount.put(employee, nameCount.getOrDefault(employee, 0) + 1);
        }

        // Сортировка по убыванию популярности
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCount.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Вывод результатов
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " повторений");
        }
    }
}
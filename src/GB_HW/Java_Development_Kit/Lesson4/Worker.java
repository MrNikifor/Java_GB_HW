package GB_HW.Java_Development_Kit.Lesson4;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Класс сотрудника.
 */
@Getter // Аннотация lombok - добавляет геттеры ко всем полям
@AllArgsConstructor // Аннотация lombok - добавление конструктора для всех полей
public class Worker {
    private long personnelNumber;
    private String phoneNumber;
    private String fullName;
    private Integer experience;

    @Override
    public String toString() {
        return String.format("Работник: %s табельный номер: %d, телефон: %s, рабочий стаж: %d лет",
                this.fullName, this.personnelNumber, this.phoneNumber, this.experience);
    }
}


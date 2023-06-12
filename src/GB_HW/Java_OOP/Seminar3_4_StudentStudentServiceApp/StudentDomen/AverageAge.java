package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen;

import java.util.List;
// создадим общий класс для вычесления среднего возраста персонала
public class AverageAge<T extends Person> {
    public double averAge(List<T> var) {
        double sum = 0;
        for (T age : var) {
            sum += age.getAge();
        }
        return sum / var.size();
    }
}

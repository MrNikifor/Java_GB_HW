package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.SyudentServise;

import java.util.List;
// создадим интерфейс по работе с логикой персонала
public interface iPersonService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, int age);
}

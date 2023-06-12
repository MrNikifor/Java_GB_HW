package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.Controllers;

import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.Person;
// создадим интерфейс основного контроллера работы с персоналом
public interface iPersonController<T extends Person> {
    void create(String firstName, String secondName, int age);
}

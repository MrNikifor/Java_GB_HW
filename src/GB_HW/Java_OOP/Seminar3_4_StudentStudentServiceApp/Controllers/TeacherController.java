package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.Controllers;

import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.Teacher;
import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.SyudentServise.TeacherService;
// создадим контроллер выполнения логики работ учителей
public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService techService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        techService.create(firstName,secondName,age);
    }
}

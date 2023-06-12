package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.Controllers;

import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.Student;
import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.SyudentServise.StudentService;
// создадим контроллер выполнения логики работ студентов
public class StudentController implements iPersonController<Student>{
    private final StudentService dataService = new StudentService();
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName,secondName,age);
    }
}

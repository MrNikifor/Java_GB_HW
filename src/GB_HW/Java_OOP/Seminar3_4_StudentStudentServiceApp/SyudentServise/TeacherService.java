package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.SyudentServise;

import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.Student;
import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.Teacher;

import java.util.ArrayList;
import java.util.List;
// создадим сервис работ с учетилями
public class TeacherService implements iPersonService<Teacher>{
    private int count;
    private String acadDegree;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }



    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher teach = new Teacher(firstName,secondName,age,count,acadDegree);
        count++;
        teachers.add(teach);
    }
}

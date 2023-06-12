package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.SyudentServise;

import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.PersonComporator;
import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.Student;

import java.util.ArrayList;
import java.util.List;
// создадим сервис работ с студентами
public class StudentService implements iPersonService<Student>{
    private int count;
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
     Student stud = new Student(firstName,secondName,age,count);
     count++;
     students.add(stud);
    }
    public List<Student> getSortFIOStudentList(){
        List<Student> newStudList = new ArrayList<Student>(students);
        newStudList.sort(new PersonComporator<Student>());
        return newStudList;
    }
}

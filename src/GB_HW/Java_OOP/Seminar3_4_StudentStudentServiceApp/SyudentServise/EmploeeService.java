package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.SyudentServise;

import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.Emploee;
import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.PersonComporator;
import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.Student;

import java.util.ArrayList;
import java.util.List;
// создадим сервис работ с работниками
public class EmploeeService implements iPersonService<Emploee> {
    private int count;
    private String special;
    private List<Emploee> emploees;

    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Emploee emp = new Emploee(firstName,secondName,age,count,special);
        count++;
        emploees.add(emp);
    }
    public List<Emploee> getSortFIOEmploeeList(){
        List<Emploee> newEmpList = new ArrayList<Emploee>(emploees);
        newEmpList.sort(new PersonComporator<Emploee>());
        return newEmpList;
    }
}

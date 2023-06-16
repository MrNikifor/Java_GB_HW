package GB_HW.Java_OOP.Seminar5_MVCStudentApp.Controller;

import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model.Student1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

// интерфейс отвечающий за действия соединения с вьющкой(View)
public interface iGetView {
    void printAllStudent(Map<Long,Student1> student1s);

    String prompt(String massage);
}

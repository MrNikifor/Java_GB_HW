package GB_HW.Java_OOP.Seminar5_MVCStudentApp.View;


import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Controller.iGetView;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model.Student1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class View implements iGetView {
//    public void printAllStudent(List<Student1> s){
//        System.out.println("------Список студентов------");
//        for (Student1 stud :s) {
//            System.out.println(stud);
//        }
//        System.out.println("------Конец списка------");
//
//    }

    @Override
    public void printAllStudent(Map<Long, Student1> student1s) {
        System.out.println("------Список студентов------");
        for (Student1 stud :student1s.values()) {
            System.out.println(stud);
        }
        System.out.println("------Конец списка------");
    }

    @Override
    public String prompt(String massage) {
        Scanner in = new Scanner(System.in);
        System.out.println(massage);
        return in.nextLine();
    }
}

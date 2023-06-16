package GB_HW.Java_OOP.Seminar5_MVCStudentApp.View;

import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Controller.iGetView;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model.Student1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
// создать клась в англоязычной вьюшкой
public class ViewEng implements iGetView {
    public void printAllStudent(Map<Long,Student1> s){
        System.out.println("------List students------");
        for (Map.Entry<Long, Student1> longStudent1Entry : s.entrySet()) {
            System.out.println(longStudent1Entry);
        }
        System.out.println("------End list------");

    }

    @Override
    public String prompt(String massage) {
        Scanner in = new Scanner(System.in);
        System.out.println(massage);
        return in.nextLine();
    }
}

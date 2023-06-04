package GB_HW.Java_OOP.Seminar3_StudentStudentServiceApp;

import GB_HW.Java_OOP.Seminar3_StudentStudentServiceApp.StudentDomen.Student;
import GB_HW.Java_OOP.Seminar3_StudentStudentServiceApp.StudentDomen.StudentGroup;
import GB_HW.Java_OOP.Seminar3_StudentStudentServiceApp.StudentDomen.StudentSteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
1) Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup).
2) Для класса StudentSteam реализовать интерфейс Iterable и вывести через for несколько групп со списком студентов на кансоль
3) Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству студентов в группе) и отсортировать
группы студентов в потоке, а затем вывести в консоль
(задача со *)
1) Отсортировать группы студентов в потоке сначало по количеству студентов, а затем по идентификатору группы
2) Переопределить методы ToString классов StudentGroup(выводить идентификатор группы, количество студентов и список студентов)
и StudentSteam(выводить номер потока, количество групп и список студентов с указанием идентификатора группы)
*/

public class App {
    public static void main(String[] args) {
        // создаем студентов и 3 группы
        Student s1 = new Student("Иван", "Орлов", 22,11);
        Student s2 = new Student("Кирилл", "Петров", 20,4);
        Student s3 = new Student("Томара", "Смирнова", 21,7);
        Student s4 = new Student("Ира", "Лакина", 23,9);
        Student s5 = new Student("Сергей", "Шпорт", 22,1);
        Student s6 = new Student("Миша", "Богатов", 19,5);
        Student s7 = new Student("Инна", "Чейчук", 18,6);
        Student s8 = new Student("Александр", "Шматков", 22,8);
        Student s9 = new Student("Елена", "Михалкова", 20,10);
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        List<Student> studentList3 = new ArrayList<>();
        studentList1.add(s1);studentList2.add(s4);studentList3.add(s7);
        studentList1.add(s2);studentList2.add(s5);studentList3.add(s8);
        studentList1.add(s3);studentList2.add(s6);studentList3.add(s9);

        //создадим группы
        StudentGroup group1 = new StudentGroup(1,studentList1);
        StudentGroup group2 = new StudentGroup(2,studentList2);
        StudentGroup group3 = new StudentGroup(3,studentList3);
        List<StudentGroup> groupList1 = new ArrayList<>();
        List<StudentGroup> groupList2 = new ArrayList<>();
        List<StudentGroup> groupList3 = new ArrayList<>();
        groupList1.add(group1);
        groupList2.add(group2);
        groupList3.add(group3);

        // создадим потоки с группами
        StudentSteam steam1 = new StudentSteam(groupList1);
        StudentSteam steam2 = new StudentSteam(groupList2);
        StudentSteam steam3 = new StudentSteam(groupList3);
        List<StudentSteam> steamList = new ArrayList<>();
        steamList.add(steam1);
        steamList.add(steam2);
        steamList.add(steam3);
        Collections.sort(steamList);
        Collections.sort(studentList1);
        for (StudentGroup group :steam1) {
            System.out.println(group);
            for (Student stud :group1) {
                System.out.println(stud);
            }
        }
        Collections.sort(studentList2);
        for (StudentGroup group :steam2) {
            System.out.println(group);
            for (Student stud :group2) {
                System.out.println(stud);
            }
        }
        Collections.sort(studentList3);
        for (StudentGroup group :steam3) {
            System.out.println(group);
            for (Student stud :group3) {
                System.out.println(stud);
            }
        }


//
    }
}


// for (Student stud :group1) {
//            System.out.println(stud);
//        }
//        System.out.println("--------------");
//        Collections.sort(group1.getStudents());
//        for (Student stud :group1) {
//            System.out.println(stud);
//        }

// пример работы итератора с цыклом while

//    ArrayList<String> arrayStr = new ArrayList<>();
//                arrayStr.add("Иван");
//                arrayStr.add("Вася");
//                arrayStr.add("Инна");
//                arrayStr.add("Томара");
//                System.out.println(arrayStr);
//
//                // Выведем элементы с листа
//                Iterator<String> iterator = arrayStr.iterator();
//        while (iterator.hasNext()){
//        System.out.println(iterator.next());
//        }
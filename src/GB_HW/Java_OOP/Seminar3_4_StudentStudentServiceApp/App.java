package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp;

import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.Controllers.EmploeeController;
import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.*;
import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.SyudentServise.EmploeeService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Семинар 3
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
// Семинар 4
/*
1) Создать класс TeacherService и реализовать аналогично проделанному на семинаре. Подключить обобщенный интерфейс
  iUserService. Добавить метод вывода списка учителей отсортированного обобщенным классом UserComparator
2) Создать класс TeacherController. Подключить к классу обобщенный интерфейс iUserController.
3) Разработать обобщенный класс AverageAge для подсчета среднего возраста студентов, учителей и работников.
  Вывести результат работы класса на консоль.
(Задача со *) Переписать иерархию User->Student/Teacher/Emploee в иерархию обобщенных типов.*/


public class App {
    public static void main(String[] args) {
        // создадим студентов, учителей, преподователей для вычесления среднего возраста
//         List<Student> students = new ArrayList<>();
//         students.add(new Student("Иван", "Орлов", 18, 11));
//         students.add(new Student("Кирилл", "Петров", 20, 4));
//         students.add(new Student("Томара", "Смирнова", 21, 7));
//         students.add(new Student("Сергей", "Шпорт", 19,1));
//         students.add(new Student("Инна", "Чейчук", 18,6));
//
//         List<Teacher> teachers = new ArrayList<>();
//         teachers.add(new Teacher("Эдуард", "Лясов", 28, 11,"Учитель"));
//         teachers.add(new Teacher("Юлия", "Крылова", 37, 4,"Доктор наук"));
//         teachers.add(new Teacher("Ирина", "Смирнова", 40, 7,"Степень 3"));
//         teachers.add(new Teacher("Заур","Акимов",33,17,"Учитель"));
//
//         List<Emploee> emploees = new ArrayList<>();
//         emploees.add(new Emploee("Марина", "Мохова",33,2,"Уборщица"));
//         emploees.add(new Emploee("Олег", "Рыков", 46, 4,"Повар"));
//         emploees.add(new Emploee("Василий", "Колоколов", 49, 7,"Охранник"));
//         emploees.add(new Emploee("Мария", "Волкова", 27, 15,"Бухгалтер"));
//
//         AverageAge<Student> studentAverageAge = new AverageAge<>();
//         double avAgSt = studentAverageAge.averAge(students);
//        System.out.println("Средний возраст студента: " + avAgSt);
//
//        AverageAge<Teacher> teacherAverageAge = new AverageAge<>();
//        double tchAgSt = teacherAverageAge.averAge(teachers);
//        System.out.println("Средний возраст учителя: " + tchAgSt);
//
//        AverageAge<Emploee> emploeeAverageAge = new AverageAge<>();
//        double empAgSt = emploeeAverageAge.averAge(emploees);
//        System.out.println("Средний возраст работника: " + empAgSt);


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

        // создаем работников
        Emploee emp = new Emploee("Заур","Акимов",33,1,"Учитель");
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        List<Student> studentList3 = new ArrayList<>();
        studentList1.add(s1);studentList2.add(s4);studentList3.add(s7);
        studentList1.add(s2);studentList2.add(s5);studentList3.add(s8);
        studentList1.add(s3);studentList2.add(s6);studentList3.add(s9);
//
        //создадим группы
        StudentGroup group1 = new StudentGroup(1,studentList1);
        StudentGroup group2 = new StudentGroup(2,studentList2);
        StudentGroup group3 = new StudentGroup(3,studentList3);
        List<StudentGroup> groupList1 = new ArrayList<>();
        List<StudentGroup> groupList2 = new ArrayList<>();
        List<StudentGroup> groupList3 = new ArrayList<>();
        groupList1.add(group3);
        groupList2.add(group2);
        groupList2.add(group1);
        groupList3.add(group2);
        groupList3.add(group3);
        groupList3.add(group3);
//
//        // создадим потоки с группами
        StudentSteam steam1 = new StudentSteam(2,groupList3);
        StudentSteam steam2 = new StudentSteam(3,groupList2);
        StudentSteam steam3 = new StudentSteam(1,groupList1);
        List<StudentSteam> steamList = new ArrayList<>();
        steamList.add(steam1);
        steamList.add(steam2);
        steamList.add(steam3);
//
//        //сортировка и вывод групп
//        Collections.sort(steamList);
//        Collections.sort(groupList1);
//        Collections.sort(groupList2);
//        Collections.sort(groupList3);
//
//        // выплата зп через вызов класса и метода благодоря преобразования метода в static
        EmploeeController.paySalary(emp);

        for (StudentSteam s :steamList) {
            System.out.println(s.getGroups().size());
            for (StudentGroup g :s) {
             //  System.out.println(g);
                System.out.println(g.getStudents());
            }
        }

    }
}

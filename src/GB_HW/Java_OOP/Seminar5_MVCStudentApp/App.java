package GB_HW.Java_OOP.Seminar5_MVCStudentApp;

/*1) Сделать вариант класса ViewEng с текстом на английском языке, подключить к нему интерфейс iGetView. Класс ViewEng подключить
к контроллеру.
        2) Сделать вариант класса hachModel с хранилищем типа HashMap<Long,Student>, подключить к нему интерфейс iGetModel.
        Класс подключить к контроллеру.
        3) Добавить команду в метод run класса контролер по удалению студента:
        Для этого: Добавить в switch команду DELETE
        - запросить у пользователя номер студента на удаление
        - вызов удаления у модели(метод добавить в интерфейс iGetModel)
        - если такого нромера нет, то сообщить об этом
        Весь код прокомментировать и добавить само-документацию.

        (задача со *)
        1) решить базовое решение
        2) сделать выбор языка при запуске контроллера
        3) сделать несколько моделей и студентов распределить по ним
        4) если не найден студент в одной модели продолжить поиск в следующей*/

import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Controller.Controller;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Controller.iGetModel;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Controller.iGetView;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model.FileModel;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model.HashModel;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model.Model;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model.Student1;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.View.View;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.View.ViewEng;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // создадим студентов
/*        List<Student1> students1 = new ArrayList<>();
        students1.add(new Student1("Иван", "Орлов", 18, 11));
        students1.add(new Student1("Кирилл", "Петров", 20, 4));
        students1.add(new Student1("Томара", "Смирнова", 21, 7));
        students1.add(new Student1("Сергей", "Шпорт", 19, 1));
        students1.add(new Student1("Инна", "Чейчук", 18, 6));*/

        // создадим студентов english
//        List<Student1> studentsEngl = new ArrayList<>();
//        studentsEngl.add(new Student1("Ivan", "Orlov", 18));
//        studentsEngl.add(new Student1("Kirill", "Petrov", 20));
//        studentsEngl.add(new Student1("Tomara", "Smirnova", 21));
//        studentsEngl.add(new Student1("Sergey", "Shport", 19));
//        studentsEngl.add(new Student1("Inna", "Cheichuk", 18));

        // создадим студентов english HashMap

        Map<Long,Student1> student1Map = new HashMap<>();
        student1Map.put(1L,new Student1("Ivan", "Orlov", 18));
        student1Map.put(2L,new Student1("Kirill", "Petrov", 20));
        student1Map.put(3L,new Student1("Tomara", "Smirnova", 21));
        student1Map.put(4L,new Student1("Sergey", "Shport", 19));
        student1Map.put(5L,new Student1("Inna", "Cheichuk", 18));

        // создаем текстовый файл
        //FileModel fileModel = new FileModel("StudentDBEnglHashMap.txt");
        //fileModel.saveAllStudentToFile(student1Map);

        // создаем прямое подключение к интерфейсу
        //iGetModel newFModel = fileModel;

        iGetModel model = new HashModel(student1Map);
        //iGetView view = new View();
        iGetView viewEng = new ViewEng();


        // запускаем новый подключенный файл через подключенный интерфейс
        Controller controller = Controller.getviewEng(viewEng,model);

        // запускаем контроллер
       // controller.updateEngl();

        // запускаем введение данных пользователем
        controller.run();
    }

}

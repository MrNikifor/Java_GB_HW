package GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model;

import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.Student;
import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Controller.iGetModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// класс записывающий данные в базу данных(Model)
public class FileModel /*implements iGetModel*/ {
    private String fileName;   // переменная записи пути к файлу

    public FileModel(String fileName) {
        this.fileName = fileName;

        // проверка на существование файла
        try(FileWriter fw = new FileWriter(fileName,true)) {
             fw.flush();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    // сетод который берет данные с файла для считывания
//    @Override
//    public List<Student1> getAllStudent() {
//        List<Student1> students  = new ArrayList<Student1>(); // создадим временный лист для записи и чтения данных
//        try
//        {
//            File file = new File(fileName);  // подключаемся к файлу
//            FileReader fr = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fr);
//            String line = reader.readLine();
//            while(line!=null)        // проходимся по файлу цыклом
//            {
//                String[] param = line.split(" "); // начинаем рапарсивать файл с помощи split
//                // создаем студентов и записываем в новый лист
//                Student1 pers = new Student1(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
//                students.add(pers);
//                line = reader.readLine();
//            }
//
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//
//        return students;
//    }
    // метод сохранения данных в файл по списку которому мы собрали
    public void saveAllStudentToFile(Map<Long,Student1> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student1 pers : students.values())
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public Map<Long, Student1> getAllHashMapStudent() {
        Map<Long,Student1> students  = new HashMap<>(); // создадим временный лист для записи и чтения данных
        try
        {
            File file = new File(fileName);  // подключаемся к файлу
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)        // проходимся по файлу цыклом
            {
                String[] param = line.split(" "); // начинаем рапарсивать файл с помощи split
                // создаем студентов и записываем в новый лист
                Student1 pers = new Student1(param[1], param[2], Integer.parseInt(param[3]));
                students.put(Long.parseLong(param[0]),pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }
}

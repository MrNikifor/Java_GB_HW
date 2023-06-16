package GB_HW.Java_OOP.Seminar5_MVCStudentApp.Controller;

import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model.Student1;

import java.util.List;
import java.util.Map;

// интерфейс отвечающий за действия соединения с базой данных(Model)
public interface iGetModel {
   // public List<Student1> getAllStudent();
   Map<Long,Student1> getAllHashMapStudent();

  String deleteStudentBuyID();


}

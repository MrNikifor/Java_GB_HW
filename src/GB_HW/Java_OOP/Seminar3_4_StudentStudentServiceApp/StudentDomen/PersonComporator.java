package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen;

import java.util.Comparator;
// создадим общий класс с обобщением наследовавшимся от Person и имплементируем Comparator для сортировки объектов
// по именни и фамилии его потомков
public class PersonComporator <T extends Person> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultComparing = o1.getFirstName().compareTo(o1.getFirstName());
        if(resultComparing == 0){
            resultComparing = o1.getSecondName().compareTo(o1.getSecondName());
            return resultComparing;
        }
        else{
            return resultComparing;
        }
    }
}

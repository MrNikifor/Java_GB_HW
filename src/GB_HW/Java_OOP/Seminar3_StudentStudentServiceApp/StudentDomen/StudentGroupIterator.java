package GB_HW.Java_OOP.Seminar3_StudentStudentServiceApp.StudentDomen;

import java.util.Iterator;
import java.util.List;
// создадим класс StudentGroupIterator и имплементируем Iterator для создания логики итерации студентов
public class StudentGroupIterator implements Iterator<Student> {
    private  int counter;
    private final List<Student> students;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if(!hasNext()){
            return null;
        }
        return students.get(counter++);
    }
}

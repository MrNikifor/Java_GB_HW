package GB_HW.Java_OOP.Seminar3_StudentStudentServiceApp.StudentDomen;

import java.util.Iterator;
import java.util.List;
// создадим класс StudentGroup и имплементируем Iterable и Comparable чтобы создать цыкл и вывести на экран студентов
// и возможность сортировать по разным полям и объектам
public class StudentGroup implements Iterable<Student>,Comparable<StudentGroup> {
    private int numberGroup;
    private List<Student> students;

    public StudentGroup(int numberGroup, List<Student> students) {
        this.numberGroup = numberGroup;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                ", numberGroup=" + numberGroup +
                ", firstName=" +
                '}';
    }

    // переопределим метод Iterator интерфейса Iterable созданием объекта StudentGroupIterator
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            public int index = 0;

            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(index++);
            }
        };
    }
    // переопределим метод сортировки по номеру группы
    @Override
    public int compareTo(StudentGroup o) {
        return (this.numberGroup - o.numberGroup);
    }
}
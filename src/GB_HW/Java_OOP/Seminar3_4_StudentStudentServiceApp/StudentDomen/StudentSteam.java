package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen;

import java.util.Iterator;
import java.util.List;
// создадим класс StudentSteam и имплементируем Iterable и Comparable чтобы создать цыкл и вывести на экран студентов
// и возможность сортировать по полям
public class StudentSteam implements Iterable<StudentGroup>,Comparable<StudentSteam> {
    private int numberSteam;
    private List<StudentGroup> groups;

    public StudentSteam(int numberSteam, List<StudentGroup> groups) {
        this.numberSteam = numberSteam;
        this.groups = groups;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "numberSteam='" + numberSteam + '\'' +
                ", groups=" + groups +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            public int index = 0;

            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return groups.get(index++);
            }

        };
    }
    // переопределим метод сортировки по номеру потока
    @Override
    public int compareTo(StudentSteam o) {
         return  (groups.size() - o.groups.size());
//        if(res == 0){
//            return 0;
//        }
//        if (res > 0){
//            return 1;
//        }
//        return -1;
    }
}
package GB_HW.Java_Junior.Lesson3_Serialization;

import java.io.*;

/*Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
Обеспечьте поддержку сериализации для этого класса.
Создайте объект класса Student и инициализируйте его данными.
Сериализуйте этот объект в файл.
Десериализуйте объект обратно в программу из файла.
Выведите все поля объекта, включая GPA, и ответьте на вопрос,
почему значение GPA не было сохранено/восстановлено.*/


/*Модификатор transient в Java используется для полей объекта,
которые не должны сериализоваться при сохранении объекта в файл или передаче по сети.
Этот модификатор позволяет избежать сериализации таких полей, как:

Поля, которые содержат промежуточное состояние объекта, которое легче вычислить, чем сериализовать и десериализовать.

Ссылки на объекты, которые не требуют сериализации или не могут быть сериализованы.

При десериализации объекта, поля, помеченные transient, инициализируются значением по умолчанию*/
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Серега",33,4.9);

        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Средний бал: " + student.getGTA());
        System.out.println();

        try (FileOutputStream fileOut = new FileOutputStream("studentdata.bin");
              ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(student);
            System.out.println("Обьект Student сериализован.");
        }

        try (FileInputStream fileoIn = new FileInputStream("studentdata.bin");
             ObjectInputStream in = new ObjectInputStream(fileoIn))
        {
            student = (Student)in.readObject();
            System.out.println("Обьект Student десериализован.");
        }
        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Средний бал: (должен быть null, так как transient): " + student.getGTA());
    }
}

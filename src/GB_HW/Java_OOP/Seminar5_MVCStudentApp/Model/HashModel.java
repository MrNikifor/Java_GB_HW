package GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model;

import GB_HW.Java_OOP.Seminar5_MVCStudentApp.Controller.iGetModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashModel implements iGetModel {
    Map<Long, Student1> student1Map = new HashMap<>();

    public HashModel(Map<Long, Student1> student1Map) {
        this.student1Map = student1Map;
    }

    @Override
    public Map<Long, Student1> getAllHashMapStudent() {
        return student1Map;
    }
// метод deleteStudentBuyID удалят выбранный объект пользователем по id и если такого нет в наличии выводит
// соответсвующее обьявление
    @Override
    public String deleteStudentBuyID() {
        System.out.println("Enter id:");
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();
        if (student1Map.containsKey(id)) {
            student1Map.remove(id);
            System.out.println("You delete is:" + id);
        } else {
            System.out.println("No this id!!!");
        }
        System.out.println("Enter the command:");
        return scanner.nextLine();
    }
}

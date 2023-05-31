package GB_HW.Java_API.Seminar4;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        LinkedList<Integer> reversedList = reverseLinkedList(list);

        for (Integer number : reversedList) {
            System.out.print(number);
        }
    }
    public static LinkedList reverseLinkedList(LinkedList list) {
        LinkedList reversedList = new LinkedList();
        for(int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}

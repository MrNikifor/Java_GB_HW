package GB_HW.Java_API.Seminar4;

import java.util.LinkedList;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
        • enqueue() — помещает элемент в конец очереди,
        • dequeue() — возвращает первый элемент из очереди и удаляет его,
        • first() — возвращает первый элемент из очереди, не удаляя.*/
public class Task2 {
    private LinkedList<Object> list = new LinkedList<Object>();

    public void enqueue(Object obj) {
        list.addLast(obj);
    }

    public Object dequeue() {
        return list.removeFirst();
    }

    public Object first() {
        return list.getFirst();
    }
}


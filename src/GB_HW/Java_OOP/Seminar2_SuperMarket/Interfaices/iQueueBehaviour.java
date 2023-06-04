package GB_HW.Java_OOP.Seminar2_SuperMarket.Interfaices;
// создадим интерфейс с поведение очереди
import GB_HW.Java_OOP.Seminar2_SuperMarket.Classes.Actor;

public interface iQueueBehaviour {
    void takeTnQueue(Actor actor);  // занять очередь
    void realiseFromQueue();   // реализуем очередь
    void takeOrder(); // принять заказ
    void giveOrder(); // отдать заказ
}

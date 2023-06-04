package GB_HW.Java_OOP.Seminar2_SuperMarket.Interfaices;
// создадим интерфейс с поведением Actor
import GB_HW.Java_OOP.Seminar2_SuperMarket.Classes.Actor;

public interface iActorBehaviour {
    void setReturnOrder(boolean returnOrder); // установить возврат
    void setMakeOrder(boolean makeOrder); // установить заказ
    void setTakeOrder(boolean makeOrder); // установить порядок приема
    boolean isMakeOrder();  // сделать заказ
    boolean isTakeOrder();  // принят заказ
    boolean isReturnOrder(); // возврат заказа
    Actor getActor();
}

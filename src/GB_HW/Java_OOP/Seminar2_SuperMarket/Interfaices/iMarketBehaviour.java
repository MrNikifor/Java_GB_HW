package GB_HW.Java_OOP.Seminar2_SuperMarket.Interfaices;
import GB_HW.Java_OOP.Seminar2_SuperMarket.Classes.Actor;
// создадим интерфейс с поведение в магазине
import java.util.List;

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor); // принять заказ
    void releaseFromMarket(List<Actor> actors); // отпустить заказ
    void update();  // обновить
}

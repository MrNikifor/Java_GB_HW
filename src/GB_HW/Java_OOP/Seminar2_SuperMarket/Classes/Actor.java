package GB_HW.Java_OOP.Seminar2_SuperMarket.Classes;
// создаем абстракционный класс основа для Супермаркета
import GB_HW.Java_OOP.Seminar2_SuperMarket.Interfaices.iActorBehaviour;
import GB_HW.Java_OOP.Seminar2_SuperMarket.Interfaices.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;  // имя покупателя
    protected Boolean isTakeOrder;  // принять заказ
    protected Boolean isMakeOrder; // сделать заказ
    protected Boolean isReturnOrder; // возврат заказа

    public Actor(String name) {
        this.name = name;
    }
     abstract public String getName();

}

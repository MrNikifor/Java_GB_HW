/*1) Добавить класс, описывающий акционного клиента. Включить поле название акции,
id клиента и количество участников в акции(поле статическое)
2) Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы могут понадобиться и подключить интерфейс
к классам клиентов.
3) Добавить комментарии(javadoc) ко всем методам и интерфейсам.
(задача со *)
1) Реализовать отказ в обслуживании для акционного клиента при превышении участников акции
2) Сохранить в файл лог работы магазина, включая возвраты товара(реализовать возврат нескольких товаров)*/
package GB_HW.Java_OOP.Seminar2_SuperMarket;

import GB_HW.Java_OOP.Seminar2_SuperMarket.Classes.Market;
import GB_HW.Java_OOP.Seminar2_SuperMarket.Classes.OrdinaryClient;
import GB_HW.Java_OOP.Seminar2_SuperMarket.Classes.SpecialClient;
import GB_HW.Java_OOP.Seminar2_SuperMarket.Classes.StockClient;
import GB_HW.Java_OOP.Seminar2_SuperMarket.Interfaices.iActorBehaviour;

public class App {
    public static void main(String[] args) {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Masha");
        iActorBehaviour client3 = new SpecialClient("Prezident",1);
        StockClient client4 = new StockClient("Tomara",22,"Bread 10%");

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.takeReturnQueue(client4);
        market.returnOrder();
    }
}

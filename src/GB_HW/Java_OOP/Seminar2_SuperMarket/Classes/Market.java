package GB_HW.Java_OOP.Seminar2_SuperMarket.Classes;

import GB_HW.Java_OOP.Seminar2_SuperMarket.Interfaices.iActorBehaviour;
import GB_HW.Java_OOP.Seminar2_SuperMarket.Interfaices.iQueueBehaviour;
import GB_HW.Java_OOP.Seminar2_SuperMarket.Interfaices.iMarketBehaviour;
import GB_HW.Java_OOP.Seminar2_SuperMarket.Interfaices.iReturnOrder;

import java.util.ArrayList;
import java.util.List;

public class Market implements iMarketBehaviour, iQueueBehaviour {
    private List<iActorBehaviour> queue;   // создаем поле(лист) с покупателями
    private List<iActorBehaviour> retqueue; // создаем поле(лист) с возвратом покупателя

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {      // принемаем заказ в магазине
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин");
        takeTnQueue(actor.getActor());              // клиент встает в очередь
    }

    @Override
    public void takeTnQueue(Actor actor) {  // занимаем очередь
        this.queue.add(actor);  // клиент в очереди
        System.out.println(actor.getName() + " клиент добавлен в очередь");
    }

    @Override
    public void takeOrder() {  // делает заказ
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }
    }

    @Override
    public void giveOrder() {  // отдаем заказ
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void realiseFromQueue() { // ушел из очереди
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void releaseFromMarket(List<Actor> actor) { // отпускаем заказ в магазине
        for (Actor actor1 : actor) {
            System.out.println(actor1.getName() + " клиент ушел из магазина ");
            queue.remove(actor1);
        }
    }
    public void takeReturnQueue(Actor actor) {  // занимаем очередь
        this.retqueue.add(actor);  // клиент в очереди
        System.out.println(actor.getName() + " клиент добавлен в очередь возврата товара");
    }

    @Override
    public void update() {  // обновляем
        takeOrder();
        giveOrder();
        realiseFromQueue();
    }
    public void returnOrder() {  // отдаем заказ
        for (iActorBehaviour actor : retqueue) {
            if (actor.isReturnOrder()) {
                actor.getActor.(true);
                System.out.println(actor.getActor().getName() + " клиент вернул заказ ");
            }
        }
    }

//    @Override
//    public void returnOrder(iMarketBehaviour actor) {  // возврат товара
//        for (iActorBehaviour actor : retqueue) {
//            if (!actor.isReturnOrder()) {
//                actor.setMakeOrder(true);
//                System.out.println(actor.getActor().getName() + " клиент сделал возврат ");
//
//            }
//        }
//    }
//
//    @Override
//    public void getReturnOrder() { // причина возврата
//
//    }

}

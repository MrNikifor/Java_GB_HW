package GB_HW.Java_OOP.Seminar2_SuperMarket.Classes;
// создаем класс обычного клиента
public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
        super(name);
    }
    @Override
    public String getName() {  // имя клиента
        return super.name;
    }
    public boolean isMakeOrder(){  // сделать заказ
        return super.isMakeOrder;
    }
    public boolean isTakeOrder(){ // принят заказ
        return super.isTakeOrder;
    }

    @Override
    public boolean isReturnOrder() { // возврат товра
        return super.isReturnOrder;
    }

    @Override
    public void setReturnOrder(boolean returnOrder) { // установить причину возврата заказа
        super.isReturnOrder = returnOrder;
    }

    public void setMakeOrder(boolean makeOrder){ // установить заказ
        super.isMakeOrder = makeOrder;
    }
    public void setTakeOrder(boolean pikUpOrder){ // установить порядок приема
        super.isMakeOrder = pikUpOrder;
    }

    public Actor getActor(){ // взять основу класса
        return this;
    }

}

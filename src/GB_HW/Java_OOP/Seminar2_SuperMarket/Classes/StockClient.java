package GB_HW.Java_OOP.Seminar2_SuperMarket.Classes;

public class StockClient extends Actor {
     private int idStock;
     private String nameStock;
     private static int count;

     public StockClient(String name,int idStock, String nameStock) {
          super(name);
          this.idStock = idStock;
          this.nameStock = nameStock;
          count++;
     }
     public StockClient(String name) {
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

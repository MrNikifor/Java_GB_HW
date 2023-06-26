package GB_HW.Toy_Store;
// Реализация интерфейса Toy для конкретной игрушки
public class Car implements FunctionToy {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

package GB_HW.Java_OOP.Seminar1.Domen;

public class HotDrink extends Product{
    private int temper;

    public HotDrink(int productId, String productName, String productCategory, double price, int temper) throws Exception {
        super(productId, productName, productCategory, price);
        this.temper = temper;
    }

    public int getTemper() {
        return temper;
    }

    public void setTemper(int temper) {
        this.temper = temper;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + super.getProductName() + '\'' +
                "category='" + super.getProductCategory() + '\'' +
                ", cost=" + super.getPrice() + '\'' +
                ", tempirature='" + temper +
                '}';
    }
}

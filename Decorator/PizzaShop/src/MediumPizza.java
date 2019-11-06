public class MediumPizza extends Pizza {

    public MediumPizza() {
        order = "Medium Pizza: ";
    }
    @Override
    public String getOrder() {
        return order;
    }
    @Override
    public double price() {
        return 19.99;
    }
}

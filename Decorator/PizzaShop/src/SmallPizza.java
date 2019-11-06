public class SmallPizza extends Pizza {

    public SmallPizza() {
        order = "Small Pizza: ";
    }
    @Override
    public String getOrder() {
        return order;
    }
    @Override
    public double price() {
        return 10.99;
    }
}

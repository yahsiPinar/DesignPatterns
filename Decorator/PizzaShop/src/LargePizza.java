public class LargePizza extends Pizza {

    public LargePizza() {
        order = "Large Pizza: ";
    }
    @Override
    public String getOrder() {
        return order;
    }
    @Override
    public double price() {
        return 29.99;
    }
}

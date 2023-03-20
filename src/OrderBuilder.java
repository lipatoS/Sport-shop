public class OrderBuilder {


    public Order orderA() {
        Order order = new Order();
        order.addItem(new TshirtRed());
        order.addItem(new CapWhite());
        return order;
    }

    public Order orderB() {
        Order order = new Order();
        order.addItem(new TshirtBlue());
        order.addItem(new CapBlack());
        return order;
    }
}



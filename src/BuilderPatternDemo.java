public class BuilderPatternDemo {
    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.orderA();
        System.out.println("order A");
        orderA.showItems();
        System.out.println("Total Cost: " + orderA.getCost());

        Order orderB = orderBuilder.orderB();
        System.out.println("order B");
        orderB.showItems();
        System.out.println("Total Cost: " + orderB.getCost());
    }
}


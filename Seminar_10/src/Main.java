package HomeWork_10.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Order> orders;

    public static void main(String[] args) {
        Main main = new Main();
        main.orders = main.ordersFromDataBase();
        main.ListOrders();
    }

    private List<Order> ordersFromDataBase() {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order (1, 3565.98));
        orderList.add(new Order (2, 186.65));
        orderList.add(new Order (3, 789.30));
        return orderList;
       
    }

    private void ListOrders() {

        // Выводим список всех заказов
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    private static class Order {
        private int id;
        private double price;

        public Order(int id, double price) {
            this.id = id;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "id='" + id + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}

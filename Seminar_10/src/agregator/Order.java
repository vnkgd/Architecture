package HomeWork_10.src.agregator;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private int id;
    private List<OrderItem> items;

    public Order(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void deliteItem(OrderItem item) {
        items.remove(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (OrderItem item : items) {
            totalPrice += item.getProduct().getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public static Order getIfPresent(int id2) {
        return null;
    }
}

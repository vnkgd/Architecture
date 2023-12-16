package HomeWork_10.src.repository;

import HomeWork_10.src.agregator.Order;

import java.util.List;

public interface OrderRepository {
    void save(Order order);
    Order getById(int orderId);
    List<Order> getAll();
}

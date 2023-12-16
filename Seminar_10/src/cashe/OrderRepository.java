package HomeWork_10.src.cashe;

import HomeWork_10.src.agregator.Order;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class OrderCache {
    private Map<Integer, Order> cache = new HashMap<>();

    /**
     * Получить заказ из кэша или основного списка.
     *
     * @param id           ID заказа.
     * @param OrderList Основной список заказов.
     * @return Заказ из кэша или null, если заказ не найден.
     */
    public Order getOrder(int id, List<Order> OrderList) {
        if (cache.containsKey(id)) {
            return cache.get(id);
        } else {
            for (Order Order : OrderList) {
                if (Order.getId() == id) {
                    cache.put(id, Order);
                    return Order;
                }
            }
            return null;
        }
    }

    /**
     * Обновить информацию о заказе в кэше и основном списке.
     *
     * @param Order      Обновленная информация о заказе.
     * @param OrderList Основной список заказов.
     */
    public void updateOrder(Order Order, List<Order> OrderList) {
        cache.put(Order.getId(), Order);
        for (int i = 0; i < OrderList.size(); i++) {
            if (OrderList.get(i).getId() == Order.getId()) {
                OrderList.set(i, Order);
                break;
            }
        }
    }
}
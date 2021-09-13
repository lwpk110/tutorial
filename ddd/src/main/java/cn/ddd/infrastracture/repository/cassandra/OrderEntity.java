package cn.ddd.infrastracture.repository.cassandra;

import cn.ddd.domain.Order;
import cn.ddd.domain.OrderItem;
import cn.ddd.domain.OrderStatus;
import cn.ddd.domain.Product;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;


public class OrderEntity {

    @PrimaryKey
    private UUID id;
    private OrderStatus status;
    private List<OrderItemEntity> orderItemEntities;
    private BigDecimal price;

    public OrderEntity(UUID id, OrderStatus status, List<OrderItemEntity> orderItemEntities, BigDecimal price) {
        this.id = id;
        this.status = status;
        this.orderItemEntities = orderItemEntities;
        this.price = price;
    }

    public OrderEntity() {
    }

    public OrderEntity(Order order) {
        this.id = order.getId();
        this.price = order.getPrice();
        this.status = order.getStatus();
        this.orderItemEntities = order.getOrderItems()
            .stream()
            .map(OrderItemEntity::new)
            .collect(Collectors.toList());

    }

    public Order toOrder() {
        List<OrderItem> orderItems = orderItemEntities.stream()
            .map(OrderItemEntity::toOrderItem)
            .collect(Collectors.toList());
        List<Product> namelessProducts = orderItems.stream()
            .map(orderItem -> new Product(orderItem.getProductId(), orderItem.getPrice(), ""))
            .collect(Collectors.toList());
        Order order = new Order(id, namelessProducts.remove(0));
        namelessProducts.forEach(product -> order.addOrder(product));
        if (status == OrderStatus.COMPLETED) {
            order.complete();
        }
        return order;
    }

    public UUID getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItemEntity> getOrderItems() {
        return orderItemEntities;
    }

    public BigDecimal getPrice() {
        return price;
    }

}

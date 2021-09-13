package cn.ddd.infrastracture.repository.cassandra;

import cn.ddd.domain.OrderItem;
import cn.ddd.domain.Product;
import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;


@UserDefinedType
public class OrderItemEntity {

    private UUID productId;
    private BigDecimal price;

    public OrderItemEntity() {
    }

    public OrderItemEntity(final OrderItem orderItem) {
        this.productId = orderItem.getProductId();
        this.price = orderItem.getPrice();
    }

    public OrderItem toOrderItem() {
        return new OrderItem(new Product(productId, price, ""));
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

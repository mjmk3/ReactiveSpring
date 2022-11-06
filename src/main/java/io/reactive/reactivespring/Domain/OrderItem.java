package io.reactive.reactivespring.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("ORDER_ITEM")
public class OrderItem {

    @Id
    @Column("ORDER_ITEM_ID")
    private UUID orderItemId;

    @Column("ORDER_ID")
    private UUID orderId;

    @Column("PRODUCT_ID")
    private UUID productId;
}

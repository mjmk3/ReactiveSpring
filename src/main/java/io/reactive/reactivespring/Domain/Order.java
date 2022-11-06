package io.reactive.reactivespring.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("ORDER")
public class Order {

    @Id
    @Column("ORDER_ID")
    private UUID orderId;

    @CreatedDate
    @Column("DELIVERED_TIME")
    private OffsetDateTime deliveredTime;

    @Column("CURRENCY_CODE")
    private String currencyCode;

    @Column("SUB_TOTAL")
    private Long subTotal;

    @Column("GST_AMOUNT")
    private Long gstAmount;

    @Column("DISCOUNT_AMOUNT")
    private Long discountAmount;

    @Column("TOTAL_AMOUNT")
    private Long totalAmount;

    @CreatedDate
    @Column("DELIVERY_TIME")
    private OffsetDateTime deliveryTime;

    @Column("DELIVERY_ID")
    private UUID deliveryId;

    @Column("CUSTOMER_ID")
    private UUID customerId;

    @Column("PAYMENT_ID")
    private UUID paymentId;
}

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
@Table("PAYMENT")
public class Payment {

    @Id
    @Column("PAYMENT_ID")
    private UUID paymentId;

    @Column("PAYMENT_AMOUNT")
    private Long paymentAmount;

    @Column("PAYMENT_CURRENCY")
    private String paymentCurrency;

    @Column("AMOUNT_LOCAL_CURRENCY")
    private String amountLocalCurrency;

    @Column("CARD_ID")
    private UUID cardId;
}

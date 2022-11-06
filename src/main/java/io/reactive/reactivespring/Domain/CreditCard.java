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
@Table("CREDIT_CARD")
public class CreditCard {

    @Id
    @Column("CARD_ID")
    private UUID cardId;

    @Column("CARD_NUMBER")
    private Long cardNumber;

    @Column("HOLDER_NAME")
    private String holderName;

    @Column("EXPIRATION_DATE")
    private String expirationDate;

    @Column("SECURITY_CODE")
    private String securityCode;
}

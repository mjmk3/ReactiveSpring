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
@Table("GIFT_CARD")
public class GiftCard {

    @Id
    @Column("GIFT_CARD_ID")
    private UUID giftCardId;

    @Column("GIFT_CARD_NUMBER")
    private Long giftCardNumber;

    @Column("REMAIN_BALANCE")
    private Long remainBalance;
}

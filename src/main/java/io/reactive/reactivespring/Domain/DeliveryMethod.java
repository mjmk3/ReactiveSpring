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
@Table("DELIVERY_METHOD")
public class DeliveryMethod {

    @Id
    @Column("DELIVERY_METHOD_ID")
    private UUID deliveryMethodId;

    @Column("DELIVERY_METHOD_TITLE")
    private String deliveryMethodTitle;

    @Column("DELIVERY_METHOD_DESCRIPTION")
    private String deliveryMethodDescription;
}

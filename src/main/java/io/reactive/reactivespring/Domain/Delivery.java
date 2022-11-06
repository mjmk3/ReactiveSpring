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
@Table("DELIVERY")
public class Delivery {

    @Id
    @Column("DELIVERY_ID")
    private UUID deliveryId;

    @Column("ADDRESS_ID")
    private UUID locationId;

    @Column("DELIVERY_METHOD_ID")
    private UUID deliveryMethodId;

    @Column("DELIVERY_ASSIGNEE")
    private String deliveryAssignee;

    @Column("DELIVERY_BY")
    private String deliveredBy;
}

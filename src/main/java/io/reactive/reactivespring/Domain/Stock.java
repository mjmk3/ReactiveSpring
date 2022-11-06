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
@Table("STOCK")
public class Stock {

    @Id
    @Column("STOCK_ID")
    private UUID stockId;

    @Column("PRODUCT_VALID_QUANTITY")
    private Integer productValidQuantity;

    @Column("BRANCH_ID")
    private UUID branchId;

    @Column("PRODUCT_ID")
    private UUID productId;
}

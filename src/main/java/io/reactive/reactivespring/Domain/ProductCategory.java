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
@Table("PRODUCT_CATEGORY")
public class ProductCategory {

    @Id
    @Column("PRODUCT_CATEGORY_ID")
    private UUID productCategoryId;

    @Column("PRODUCT_ID")
    private UUID productId;

    @Column("CATEGORY_ID")
    private UUID categoryId;
}

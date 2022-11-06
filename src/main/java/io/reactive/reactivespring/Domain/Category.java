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
@Table("CATEGORY")
public class Category {

    @Id
    @Column("CATEGORY_ID")
    private UUID categoryId;

    @Column("CATEGORY_TITLE")
    private String categoryTitle;
}

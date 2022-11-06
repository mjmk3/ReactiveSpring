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
@Table("BRANCH")
public class Branch {

    @Id
    @Column("BRANCH_ID")
    private UUID branchId;

    @Column("ADDRESS_ID")
    private UUID addressId;

    @Column("BRANCH_PHONE")
    private String branchPhone;
}

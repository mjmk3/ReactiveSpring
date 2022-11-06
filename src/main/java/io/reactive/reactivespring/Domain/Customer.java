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
@Table("CUSTOMER")
public class Customer {

    @Id
    @Column("CUSTOMER_ID")
    private UUID customerId;

    @Column("FIRST_NAME")
    private String firstName;

    @Column("MIDDLE_NAME")
    private String middleName;

    @Column("LAST_NAME")
    private String lastName;

    @Column("COUNTRY_CODE")
    private Long countryCode;

    @Column("PHONE_NUMBER")
    private Long phoneNumber;

    @Column("EMAIL")
    private String email;

    @Column("PREFERRED_DELIVERY_METHOD_ID")
    private UUID preferredDeliveryId;

    @Column("PREFERRED_BRANCH_ID")
    private UUID preferredBranchId;

    @Column("ADDRESS_ID")
    private UUID addressId;

    @Column("CUSTOMER_STATUS")
    private String customerStatus;
}

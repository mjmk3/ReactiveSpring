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
@Table("ADDRESS")
public class Address {

    @Id
    @Column("ADDRESS_ID")
    private UUID addressId;

    @Column("COUNTRY")
    private String country;

    @Column("PROVINCE")
    private String province;

    @Column("CITY")
    private String city;

    @Column("STREET_NUMBER")
    private String streetNumber;

    @Column("ADDRESS_LINE_ONE")
    private String addressLineOne;

    @Column("ADDRESS_LINE_TWO")
    private String addressLineTwo;

    @Column("POSTAL_CODE")
    private String postalCode;

    @Column("UNIT_NUMBER")
    private String unitNumber;
}

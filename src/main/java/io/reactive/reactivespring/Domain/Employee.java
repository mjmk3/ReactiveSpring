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
@Table("EMPLOYEE")
public class Employee {

    @Id
    @Column("EMPLOYEE_ID")
    private UUID employeeId;

    @Column("EMPLOYEE_FIRST_NAME")
    private String employeeFirstName;

    @Column("EMPLOYEE_MIDDLE_NAME")
    private String employeeMiddleName;

    @Column("EMPLOYEE_LAST_NAME")
    private String employeeLastName;

    @Column("EMPLOYEE_JOB_CATEGORY")
    private String employeeJobCategory;

    @Column("COUNTRY_CODE")
    private Integer countryCode;

    @Column("EMPLOYEE_PHONE_NUMBER")
    private Long phoneNumber;
}

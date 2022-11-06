package io.reactive.reactivespring.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("DRIVER")
public class Driver {

    @Id
    @Column("DRIVER_ID")
    private UUID driverId;

    @Column("IS_AVAILABLE")
    private Boolean isAvailable;

    @Column("DAILY_CAPACITY")
    private String dailyCapacity;

    @Column("DELIVERED_ORDERS")
    private Long deliveredOrders;

    @Column("EMPLOYEE_DRIVER_ID")
    private UUID employeeId;

    @LastModifiedDate
    @Column("DELIVERED_TIME")
    private OffsetDateTime deliveredTime;
}

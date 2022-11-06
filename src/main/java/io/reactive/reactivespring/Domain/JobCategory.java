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
@Table("JOB_CATEGORY")
public class JobCategory {

    @Id
    @Column("JOB_ID")
    private UUID jobId;

    @Column("JOB_TITLE")
    private String jobTitle;
}

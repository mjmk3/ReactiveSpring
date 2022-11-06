package io.reactive.reactivespring.DAO;

import io.reactive.reactivespring.Domain.JobCategory;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends ReactiveCrudRepository<JobCategory, String> {
}

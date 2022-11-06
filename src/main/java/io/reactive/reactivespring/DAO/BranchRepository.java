package io.reactive.reactivespring.DAO;

import io.reactive.reactivespring.Domain.Branch;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends ReactiveCrudRepository<Branch, String> {
}

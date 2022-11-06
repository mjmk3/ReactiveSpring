package io.reactive.reactivespring.DAO;

import io.reactive.reactivespring.Domain.Driver;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends ReactiveCrudRepository<Driver, String> {
}

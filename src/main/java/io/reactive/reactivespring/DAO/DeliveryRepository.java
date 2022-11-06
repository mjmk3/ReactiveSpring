package io.reactive.reactivespring.DAO;

import io.reactive.reactivespring.Domain.Delivery;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends ReactiveCrudRepository<Delivery, String> {
}

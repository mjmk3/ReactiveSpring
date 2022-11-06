package io.reactive.reactivespring.DAO;

import io.reactive.reactivespring.Domain.Stock;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends ReactiveCrudRepository<Stock, String> {
}

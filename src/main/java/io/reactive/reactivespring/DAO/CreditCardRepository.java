package io.reactive.reactivespring.DAO;

import io.reactive.reactivespring.Domain.CreditCard;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends ReactiveCrudRepository<CreditCard, String> {
}

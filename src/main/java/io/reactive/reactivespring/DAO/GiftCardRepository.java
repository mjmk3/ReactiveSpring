package io.reactive.reactivespring.DAO;

import io.reactive.reactivespring.Domain.GiftCard;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftCardRepository extends ReactiveCrudRepository<GiftCard, String> {
}

package io.reactive.reactivespring.DAO;

import io.reactive.reactivespring.Domain.Address;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends ReactiveCrudRepository<Address, String> {
}

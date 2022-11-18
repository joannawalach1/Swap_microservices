package pl.com.great.swap.infrasctructure;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.com.great.swap.domain.Pharmacy;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PharmacyRepository extends MongoRepository<Pharmacy, UUID> {

    Optional<Pharmacy> findByName(String name);
}

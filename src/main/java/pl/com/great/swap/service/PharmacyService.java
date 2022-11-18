package pl.com.great.swap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.great.swap.domain.Pharmacy;
import pl.com.great.swap.exception.EntityNotFoundException;
import pl.com.great.swap.infrasctructure.PharmacyRepository;

import java.util.UUID;

@Service
public class PharmacyService {

    @Autowired
    private PharmacyRepository pharmacyRepository;

    public Pharmacy create(Pharmacy pharmacy) {

        return pharmacyRepository.insert(new Pharmacy(UUID.randomUUID(), pharmacy.getName()));
    }

    public Pharmacy get(String name) throws EntityNotFoundException {
        return this.pharmacyRepository.findByName(name).orElseThrow(() -> new EntityNotFoundException("Entity was not found with name " + name));
    }
}

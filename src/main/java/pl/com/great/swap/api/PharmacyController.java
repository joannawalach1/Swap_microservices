package pl.com.great.swap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.great.swap.domain.Pharmacy;
import pl.com.great.swap.exception.EntityNotFoundException;
import pl.com.great.swap.service.PharmacyService;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {

    @Autowired
    private PharmacyService pharmacyService;

    @PostMapping
    public Pharmacy create(@RequestBody Pharmacy pharmacy) {
        return this.pharmacyService.create(pharmacy);
    }

    @GetMapping
    public Pharmacy get(@RequestParam String name) throws EntityNotFoundException {
        return this.pharmacyService.get(name);
    }
}

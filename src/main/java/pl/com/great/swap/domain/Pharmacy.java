package pl.com.great.swap.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.UUID;

@Document
public class Pharmacy {

    private UUID id;
    private String name;

    private LocalDateTime created;
    private LocalDateTime updated;

    public Pharmacy(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

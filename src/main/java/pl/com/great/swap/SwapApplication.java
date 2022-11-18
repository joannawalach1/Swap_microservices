package pl.com.great.swap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SwapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwapApplication.class, args);
	}

}

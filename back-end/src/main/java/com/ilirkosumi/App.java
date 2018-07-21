package com.ilirkosumi;

import com.ilirkosumi.domain.Garage;
import com.ilirkosumi.domain.Info;
import com.ilirkosumi.domain.repository.GarageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner runner(GarageRepository repository) {
        return args -> {
            repository.save(new Garage("Bavaria Park Garage GmbH", new Info(new Integer(150), "open")));
        };
    }
}

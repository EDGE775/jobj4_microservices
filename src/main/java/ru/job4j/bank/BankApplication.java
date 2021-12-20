package ru.job4j.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BankApplication {

    @Bean
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);
    }

}

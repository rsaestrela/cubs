package me.estrela.service1;

import me.estrela.service2.api.Service2;
import me.estrela.service2.api.Service2Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Service1App {

    public static void main(String[] args) {
        SpringApplication.run(Service1App.class, args);
    }

    @Bean
    public Service2 service2() {
        return new Service2Client();
    }

}

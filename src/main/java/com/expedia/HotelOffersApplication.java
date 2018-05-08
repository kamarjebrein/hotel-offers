package com.expedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.expedia"})
public class HotelOffersApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelOffersApplication.class, args);
    }


}

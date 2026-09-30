package com.example.catalog;

import com.example.catalog.config.CatalogDisplayProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(CatalogDisplayProperties.class)
public class CourseCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseCatalogApplication.class, args);
    }
}
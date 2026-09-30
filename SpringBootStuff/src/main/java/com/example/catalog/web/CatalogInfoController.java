package com.example.catalog.web;

import com.example.catalog.config.CatalogDisplayProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogInfoController {

    private final CatalogDisplayProperties displayProperties;

    public CatalogInfoController(CatalogDisplayProperties displayProperties) {
        this.displayProperties = displayProperties;
    }

    @GetMapping("/catalog-info")
    public String catalogInfo() {
        return displayProperties.getTitle()
                + " (page size: " + displayProperties.getPageSize() + ")";
    }
}
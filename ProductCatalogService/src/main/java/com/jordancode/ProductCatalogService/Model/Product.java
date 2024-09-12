package com.jordancode.ProductCatalogService.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT",nullable = false)
    private String name;
    @Column(nullable = false)
    private Double price;
    @Column(columnDefinition = "TEXT",nullable = false)
    private List<String> photos = new ArrayList<>();
    private Map<String, String> additionalProperties;
    private Category category;
}

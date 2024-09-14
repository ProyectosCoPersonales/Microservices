package com.jordancode.ProductCatalogService.Model;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String name;
    @Column(nullable = false)
    private Double price;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;
    @Column(columnDefinition = "TEXT", nullable = false)
    private List<String> photos = new ArrayList<>();
    @Column(columnDefinition = "TEXT", nullable = false)
    private List<String> additionalProperties = new ArrayList<>();
    private Category category;
}
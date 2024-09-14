package com.jordancode.ProductCatalogService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jordancode.ProductCatalogService.Model.Product;
public interface ProductRepository extends JpaRepository<Product,Long>{
    
}

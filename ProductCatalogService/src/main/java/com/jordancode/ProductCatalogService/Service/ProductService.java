package com.jordancode.ProductCatalogService.Service;

import com.jordancode.ProductCatalogService.Model.Product;
import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product getProductById(Long productId);
    Product updateProductById(Long productId, Product product);
    List<Product> getAllProducts();
}

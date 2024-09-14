package com.jordancode.ProductCatalogService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordancode.ProductCatalogService.Model.Product;
import com.jordancode.ProductCatalogService.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        Product createdProduct = productRepository.save(product);
        return createdProduct;
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public Product updateProductById(Long productId, Product product) {
        Product existingProduct = productRepository.findById(productId).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPhotos(product.getPhotos());
            existingProduct.setAdditionalProperties(product.getAdditionalProperties());
            existingProduct.setCategory(product.getCategory());
            return productRepository.save(existingProduct);
        } else {
            return null;
        }
    }

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

}

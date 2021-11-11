package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.Product;
import com.generation.callejonDiagonal.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements  ProductService{

    private final ProductRepository productRepository;
    private int id;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(int id) {
        Optional<Product> product = Optional.ofNullable(productRepository.findById(id));
        return product.orElse(null);
    }

    @Override
    public List<Product> getProducts() {
       return (List<Product>) productRepository.findAll();
    }
}

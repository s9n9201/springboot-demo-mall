package webkent.demo.springbootmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webkent.demo.springbootmall.Repository.ProductRepository;
import webkent.demo.springbootmall.dto.ProductRequest;
import webkent.demo.springbootmall.model.Product;
import webkent.demo.springbootmall.service.ProductService;

import java.util.Date;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProductByProductId(Integer prodcutId) {

        return productRepository.getProductByProductId(prodcutId);
    }

    @Override
    public Product createProduct(ProductRequest productRequest) {
        Product product=new Product();
        Date now=new Date();
        product.setProductName(productRequest.getProductName());
        product.setCategory(productRequest.getCategory());
        product.setImageUrl(productRequest.getImageUrl());
        product.setPrice(productRequest.getPrice());
        product.setStock(productRequest.getStock());
        product.setDescription(productRequest.getDescription());
        product.setCreateDate(now);
        product.setLastModifiedDate(now);
        return productRepository.save(product);
    }

    @Override
    public Void updateProduct(Integer productId, ProductRequest productRequest) {
        Product product=new Product();
        Date now=new Date();
        product.setProductId(productId);
        product.setProductName(productRequest.getProductName());
        product.setCategory(productRequest.getCategory());
        product.setImageUrl(productRequest.getImageUrl());
        product.setPrice(productRequest.getPrice());
        product.setStock(productRequest.getStock());
        product.setDescription(productRequest.getDescription());
        product.setLastModifiedDate(now);
        productRepository.save(product);
        return null;
    }
}

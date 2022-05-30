package webkent.demo.springbootmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webkent.demo.springbootmall.Repository.ProductRepository;
import webkent.demo.springbootmall.model.Product;
import webkent.demo.springbootmall.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProductByProductId(Integer prodcutId) {

        return productRepository.getProductByProductId(prodcutId);
    }
}

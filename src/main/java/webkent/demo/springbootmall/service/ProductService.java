package webkent.demo.springbootmall.service;

import webkent.demo.springbootmall.model.Product;

public interface ProductService {
    Product getProductByProductId(Integer prodcutId);
}

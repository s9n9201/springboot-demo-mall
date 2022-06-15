package webkent.demo.springbootmall.service;

import webkent.demo.springbootmall.dto.ProductRequest;
import webkent.demo.springbootmall.model.Product;

public interface ProductService {
    Product getProductByProductId(Integer prodcutId);

    Product createProduct(ProductRequest productRequest);
}

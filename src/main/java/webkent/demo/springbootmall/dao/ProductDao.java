package webkent.demo.springbootmall.dao;

import webkent.demo.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}

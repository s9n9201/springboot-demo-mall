package webkent.demo.springbootmall.dao.impl;

import org.springframework.stereotype.Repository;
import webkent.demo.springbootmall.dao.ProductDao;
import webkent.demo.springbootmall.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
    @Override
    public Product getProductById(Integer productId) {
        return null;
    }
}

package webkent.demo.springbootmall.Repository;

import org.springframework.data.repository.CrudRepository;
import webkent.demo.springbootmall.model.Product;


import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByProductName(String productName);

    Product getProductByProductId(Integer prodcutId);
}

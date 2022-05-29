package webkent.demo.springbootmall.Repository;

import org.springframework.data.repository.CrudRepository;
import webkent.demo.springbootmall.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}

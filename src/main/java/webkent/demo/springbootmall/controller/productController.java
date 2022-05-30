package webkent.demo.springbootmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import webkent.demo.springbootmall.model.Product;
import webkent.demo.springbootmall.service.ProductService;

@RestController
public class productController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{productId}")
    public ResponseEntity<?> getProduct(@PathVariable Integer productId) {
        Product product=productService.getProductByProductId(productId);
        if (product!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(product);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

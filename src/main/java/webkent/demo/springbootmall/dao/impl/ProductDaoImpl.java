package webkent.demo.springbootmall.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import webkent.demo.springbootmall.dao.ProductDao;
import webkent.demo.springbootmall.model.Product;
import webkent.demo.springbootmall.rowmapper.ProductRowMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public Product getProductById(Integer productId) {
        String SqlStr="select * from product where product_id=:productId ";
        Map<String, Object> map=new HashMap<>();

        List<Product> productList=jdbcTemplate.query(SqlStr, map, new ProductRowMapper());

        return productList.size()>0 ? productList.get(0) : null;
    }
}

package webkent.demo.springbootmall.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import webkent.demo.springbootmall.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product=new Product();

        return null;
    }
}

package webkent.demo.springbootmall.dto;

import webkent.demo.springbootmall.constant.ProductCategory;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ProductRequest {

    @NotBlank
    private String productName;

    @NotNull
    private ProductCategory category;

    @NotBlank
    private String imageUrl;

    @Positive
    private Integer price;

    @Positive
    private Integer stock;

    private String description;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName=productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category=category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl=imageUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price=price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock=stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }
}

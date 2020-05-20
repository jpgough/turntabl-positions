package com.turntabl.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel( description = "Position data Model description")
public class Position {
    @ApiModelProperty(value = "productDetail description")
    private ProductDetail productDetail;
    @ApiModelProperty(value = "quantity description")
    private Integer quantity;
    @ApiModelProperty(value = "averagePrice description")
    private BigDecimal averagePrice;

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(BigDecimal averagePrice) {
        this.averagePrice = averagePrice;
    }
}

package com.turntabl.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel( description = "Position data Model description")
public class Position {
    @ApiModelProperty(value = "details of the traded product")
    private ProductDetail productDetail;
    @ApiModelProperty(value = "quantity of the assets")
    private Integer quantity;
    @ApiModelProperty(value = "average price of the assets")
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

package com.turntabl.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "ProductDetail data Model description")
public class ProductDetail {
    @ApiModelProperty(value = "productId description")
    private String productId;
    @ApiModelProperty(value = "exchange description")
    private String exchange;
    @ApiModelProperty(value = "ticker description")
    private String ticker;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
}

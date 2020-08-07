package com.turntabl.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "ProductDetail data Model description")
public class ProductDetail {
    @ApiModelProperty(value = "unique identifier for the product the trade was executed on")
    private String productId;
    @ApiModelProperty(value = "the exchange on which the stock is listed")
    private String exchange;
    @ApiModelProperty(value = "the executed product’s ticker symbol")
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

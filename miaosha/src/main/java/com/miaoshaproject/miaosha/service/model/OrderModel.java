package com.miaoshaproject.miaosha.service.model;

import java.math.BigDecimal;

public class OrderModel {
    //2019030700000000
    private String id;

    //购买的用户Id
    private Integer userId;

    //购买的商品Id
    private Integer itemId;

    //若非空，则表示以秒杀商品方式下单
    private Integer promoId;

    //购买商品单价，若promoid非空，则表示以秒杀商品价下单
    private BigDecimal itemPrice;

    //购买数量
    private Integer amount;

    //购买金额，若promoid非空，则表示以秒杀商品价下单
    private BigDecimal orderPrice;

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}

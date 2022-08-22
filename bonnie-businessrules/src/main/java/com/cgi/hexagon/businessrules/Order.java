package com.cgi.hexagon.businessrules;

import java.util.Objects;

public class Order {

    long id;
    String goodsId;
    int quantity;
    Status status;
    String assembler = null;

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order withId(long id) {
        this.id = id;
        return this;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Order withGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Order withStatus(Status status) {
        this.status = status;
        return this;
    }

    public String getAssembler() {
        return assembler;
    }

    public void setAssembler(String assembler) {
        this.assembler = assembler;
    }

    public Order withAssembler(String assembler) {
        this.assembler = assembler;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(goodsId, order.goodsId) && status == order.status && Objects.equals(assembler, order.assembler);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goodsId, status, assembler);
    }
}

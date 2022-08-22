package com.cgi.hexagon.h2storage;

import com.cgi.hexagon.businessrules.Status;
import org.springframework.data.annotation.Id;

public class AssemblyOrder {

    @Id
    long id;

    String goodsId;

    int quantity;

    Status status;

    String assembler = null;

    public AssemblyOrder(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AssemblyOrder withId(long id) {
        this.id = id;
        return this;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public AssemblyOrder withGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public AssemblyOrder withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public AssemblyOrder withStatus(Status status) {
        this.status = status;
        return this;
    }

    public String getAssembler() {
        return assembler;
    }

    public void setAssembler(String assembler) {
        this.assembler = assembler;
    }

    public AssemblyOrder withAssembler(String assembler) {
        this.assembler = assembler;
        return this;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity;

/**
 *
 * @author ThucNV
 */
public class CartItem {

    private Product product;
    private int quantity;
    private double cost;

    public double getCost() {
        return product.getProductPrice() * quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Product getProduct() {
        return product;
    }

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public CartItem() {
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

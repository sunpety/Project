/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.statefull;

import com.aptech.elevation.entity.CartItem;
import com.aptech.elevation.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author ThucNV
 */
@Stateful
public class ShoppingCardSession implements ShoppingCardSessionLocal {

    private List<CartItem> cartItems;

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public void addProduct(Product product) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().equals(product)) {
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                return;
            }
        }
        cartItems.add(new CartItem(product, 1));
    }

    @Override
    public void removeProduct(Integer id) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().getProductId().equals(id)) {
                cartItems.remove(cartItem);
                return;
            }
        }

    }

    @Override
    public ArrayList<Product> findAllProduct() {
        ArrayList<Product> products = new ArrayList<>();
        for (CartItem cartItem : cartItems) {
            products.add(cartItem.getProduct());
        }
        return products;
    }

    @Override
    public void removeAll() {
        this.cartItems.clear();
    }

    @Override
    public double getTotalCost() {
        double re = 0.0;
        for (CartItem cartItem : cartItems) {
            re += cartItem.getCost();
        }
        return re;
    }

    @Override
    public void updateProduct(Product product, int quantity) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().equals(product)) {
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
                return;
            }
        }
    }

}

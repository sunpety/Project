/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.statefull;

import com.aptech.elevation.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ThucNV
 */
@Local
public interface ShoppingCardSessionLocal {

    void addProduct(Product product);

    void removeProduct(Integer id);

    ArrayList<Product> findAllProduct();

    void removeAll();

    double getTotalCost();

    void updateProduct(Product product, int quantity);
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity.session;

import com.aptech.elevation.entity.Category;
import com.aptech.elevation.entity.Product;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author NeedMoney
 */
@Stateless
public class ProductFacade extends AbstractFacade<Product> implements ProductFacadeLocal {
    @PersistenceContext(unitName = "Elevation_01-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductFacade() {
        super(Product.class);
    }

    @Override
    public List<Product> FindProduct_ById(int product_id) {
        Query q = em.createQuery("SELECT p FROM Product p WHERE p.productId = :productId");
        q.setParameter("productId", product_id);
        return q.getResultList();
    }

    @Override
    public List<Product> FindProduct_ByCategoryId(int category_id) {
        Query q = em.createQuery("SELECT p FROM Product p WHERE p.categoryId = :categoryId");
        q.setParameter("categoryId",em.getReference(Category.class, category_id));
        return q.getResultList();
    }
    
}

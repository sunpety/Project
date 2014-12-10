/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity.session;

import com.aptech.elevation.entity.News;
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
public class NewsFacade extends AbstractFacade<News> implements NewsFacadeLocal {
    @PersistenceContext(unitName = "Elevation_01-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NewsFacade() {
        super(News.class);
    }

    @Override
    public List<News> DisplayProject_ByType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<News> FindAll_ByType(int type) {
        Query q = em.createQuery("SELECT n FROM News n WHERE n.newType = :newType");
        q.setParameter("newType", type);
        return q.getResultList();
    }

    @Override
    public List<News> FindNew_ById(int new_id) {
        Query q = em.createQuery("SELECT n FROM News n WHERE n.newId = :newId");
        q.setParameter("newId", new_id);
        return q.getResultList();
    }
    
    
}

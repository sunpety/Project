/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity.session;

import com.aptech.elevation.entity.Account;
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
public class AccountFacade extends AbstractFacade<Account> implements AccountFacadeLocal {
    @PersistenceContext(unitName = "Elevation_01-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }

    @Override
    public boolean CheckLogin_Home(String u, String p) {
        Query q = em.createQuery("SELECT a FROM Account a WHERE a.accountUsername = :u and a.accountPassword = :p");
        q.setParameter("u", u);
        q.setParameter("p", p);
        return q.getResultList().size()>0;
    }

    @Override
    public boolean Checkexist_User(String username) {
        Query q = em.createQuery("SELECT a FROM Account a WHERE a.accountUsername = :u");
        q.setParameter("u", username);
        return q.getResultList().size()>0;
    }

    @Override
    public List<Account> findAccount_ByUsername(String username) {
        Query q = em.createQuery("SELECT a FROM Account a WHERE a.accountUsername = :u");
        q.setParameter("u", username);
        return q.getResultList();
    }
    
    
}

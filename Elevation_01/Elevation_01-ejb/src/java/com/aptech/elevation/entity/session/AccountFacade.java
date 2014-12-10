/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity.session;

import com.aptech.elevation.entity.Account;
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
    public boolean checkLogin(String u, String p) {
        Query query = em.createQuery("SELECT a FROM Account a WHERE a.accountUsername = :u AND a.accountPassword = :p");
        query.setParameter("u", u);
        query.setParameter("p", p);
        return query.getResultList().size() > 0;

    }

    @Override
    public Account findByCredit(String u, String p) {
        Query query = em.createQuery("SELECT a FROM Account a WHERE a.accountUsername = :u AND a.accountPassword = :p");
        query.setParameter("u", u);
        query.setParameter("p", p);
        return (Account) query.getResultList().get(0);
    }

    @Override
    public boolean checkEmail(String email) {
        Query query = em.createNamedQuery("Account.findByAccountEmail");
        query.setParameter("accountEmail", email);
        return query.getResultList().size() > 0;
    }

    @Override
    public void removeById(int id) {
        Query query;
        query = em.createQuery("DELETE FROM Account a WHERE a.accountId = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

}

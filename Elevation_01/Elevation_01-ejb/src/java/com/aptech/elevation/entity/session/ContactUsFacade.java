/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity.session;

import com.aptech.elevation.entity.ContactUs;
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
public class ContactUsFacade extends AbstractFacade<ContactUs> implements ContactUsFacadeLocal {
    @PersistenceContext(unitName = "Elevation_01-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContactUsFacade() {
        super(ContactUs.class);
    }

    @Override
    public List<ContactUs> FindContact_ByOffice(String office) {
        Query q = em.createQuery("SELECT c FROM ContactUs c WHERE c.contactWebsiteOffice = :contactWebsiteOffice");
        q.setParameter("contactWebsiteOffice", office);
        return q.getResultList();
    }
  
    
}

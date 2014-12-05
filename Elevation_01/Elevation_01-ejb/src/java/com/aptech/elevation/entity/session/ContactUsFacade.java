/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity.session;

import com.aptech.elevation.entity.ContactUs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    
}

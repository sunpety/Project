/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity.session;

import com.aptech.elevation.entity.ContactUs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NeedMoney
 */
@Local
public interface ContactUsFacadeLocal {

    void create(ContactUs contactUs);

    void edit(ContactUs contactUs);

    void remove(ContactUs contactUs);

    ContactUs find(Object id);

    List<ContactUs> findAll();

    List<ContactUs> findRange(int[] range);

    int count();
    
}

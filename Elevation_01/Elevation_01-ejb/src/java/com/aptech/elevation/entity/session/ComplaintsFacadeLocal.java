/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity.session;

import com.aptech.elevation.entity.Complaints;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NeedMoney
 */
@Local
public interface ComplaintsFacadeLocal {

    void create(Complaints complaints);

    void edit(Complaints complaints);

    void remove(Complaints complaints);

    Complaints find(Object id);

    List<Complaints> findAll();

    List<Complaints> findRange(int[] range);

    int count();
    
}

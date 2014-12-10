/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.session.statefull;

import com.aptech.elevation.entity.Account;
import javax.ejb.Local;

/**
 *
 * @author ThucNV
 */
@Local
public interface LoggedAccountLocal {

    Account getLoggedAccount();

    void setLoggedAccount(Account account);

    public void setLoggedAccount(String u, String p);

}

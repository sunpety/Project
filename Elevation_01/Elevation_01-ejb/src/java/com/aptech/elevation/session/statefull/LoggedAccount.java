/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.session.statefull;

import com.aptech.elevation.entity.Account;
import com.aptech.elevation.entity.session.AccountFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 *
 * @author ThucNV
 */
@Stateful
public class LoggedAccount implements LoggedAccountLocal {

    @EJB
    private AccountFacadeLocal accountFacade;

    private Account loggedAccount;

    @Override
    public Account getLoggedAccount() {
        return this.loggedAccount;
    }

    @Override
    public void setLoggedAccount(Account account) {
        this.loggedAccount = account;
    }

    @Override
    public void setLoggedAccount(String u, String p) {
        this.loggedAccount = accountFacade.findByCredit(u, p);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NeedMoney
 */
@Entity
@Table(name = "account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.findByAccountId", query = "SELECT a FROM Account a WHERE a.accountId = :accountId"),
    @NamedQuery(name = "Account.findByRolesId", query = "SELECT a FROM Account a WHERE a.rolesId = :rolesId"),
    @NamedQuery(name = "Account.findByAccountUsername", query = "SELECT a FROM Account a WHERE a.accountUsername = :accountUsername"),
    @NamedQuery(name = "Account.findByAccountPassword", query = "SELECT a FROM Account a WHERE a.accountPassword = :accountPassword"),
    @NamedQuery(name = "Account.findByAccountFirstname", query = "SELECT a FROM Account a WHERE a.accountFirstname = :accountFirstname"),
    @NamedQuery(name = "Account.findByAccountLastname", query = "SELECT a FROM Account a WHERE a.accountLastname = :accountLastname"),
    @NamedQuery(name = "Account.findByAccountCompany", query = "SELECT a FROM Account a WHERE a.accountCompany = :accountCompany"),
    @NamedQuery(name = "Account.findByAccountAddress1", query = "SELECT a FROM Account a WHERE a.accountAddress1 = :accountAddress1"),
    @NamedQuery(name = "Account.findByAccountAddress2", query = "SELECT a FROM Account a WHERE a.accountAddress2 = :accountAddress2"),
    @NamedQuery(name = "Account.findByAccountCity", query = "SELECT a FROM Account a WHERE a.accountCity = :accountCity"),
    @NamedQuery(name = "Account.findByAccountStates", query = "SELECT a FROM Account a WHERE a.accountStates = :accountStates"),
    @NamedQuery(name = "Account.findByAccountZipcode", query = "SELECT a FROM Account a WHERE a.accountZipcode = :accountZipcode"),
    @NamedQuery(name = "Account.findByAccountCountry", query = "SELECT a FROM Account a WHERE a.accountCountry = :accountCountry"),
    @NamedQuery(name = "Account.findByAccountEmail", query = "SELECT a FROM Account a WHERE a.accountEmail = :accountEmail"),
    @NamedQuery(name = "Account.findByAccountPhone", query = "SELECT a FROM Account a WHERE a.accountPhone = :accountPhone"),
    @NamedQuery(name = "Account.findByAccountStatus", query = "SELECT a FROM Account a WHERE a.accountStatus = :accountStatus")})
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Integer accountId;
    @Column(name = "roles_id")
    private Integer rolesId;
    @Size(max = 50)
    @Column(name = "account_username")
    private String accountUsername;
    @Size(max = 50)
    @Column(name = "account_password")
    private String accountPassword;
    @Size(max = 50)
    @Column(name = "account_firstname")
    private String accountFirstname;
    @Size(max = 50)
    @Column(name = "account_lastname")
    private String accountLastname;
    @Size(max = 50)
    @Column(name = "account_company")
    private String accountCompany;
    @Size(max = 100)
    @Column(name = "account_address1")
    private String accountAddress1;
    @Size(max = 100)
    @Column(name = "account_address2")
    private String accountAddress2;
    @Size(max = 50)
    @Column(name = "account_city")
    private String accountCity;
    @Size(max = 50)
    @Column(name = "account_states")
    private String accountStates;
    @Size(max = 50)
    @Column(name = "account_zipcode")
    private String accountZipcode;
    @Size(max = 50)
    @Column(name = "account_country")
    private String accountCountry;
    @Size(max = 100)
    @Column(name = "account_email")
    private String accountEmail;
    @Size(max = 30)
    @Column(name = "account_phone")
    private String accountPhone;
    @Column(name = "account_status")
    private Boolean accountStatus;
    @OneToMany(mappedBy = "accountId")
    private List<Orders> ordersList;

    public Account() {
    }

    public Account(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getAccountFirstname() {
        return accountFirstname;
    }

    public void setAccountFirstname(String accountFirstname) {
        this.accountFirstname = accountFirstname;
    }

    public String getAccountLastname() {
        return accountLastname;
    }

    public void setAccountLastname(String accountLastname) {
        this.accountLastname = accountLastname;
    }

    public String getAccountCompany() {
        return accountCompany;
    }

    public void setAccountCompany(String accountCompany) {
        this.accountCompany = accountCompany;
    }

    public String getAccountAddress1() {
        return accountAddress1;
    }

    public void setAccountAddress1(String accountAddress1) {
        this.accountAddress1 = accountAddress1;
    }

    public String getAccountAddress2() {
        return accountAddress2;
    }

    public void setAccountAddress2(String accountAddress2) {
        this.accountAddress2 = accountAddress2;
    }

    public String getAccountCity() {
        return accountCity;
    }

    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity;
    }

    public String getAccountStates() {
        return accountStates;
    }

    public void setAccountStates(String accountStates) {
        this.accountStates = accountStates;
    }

    public String getAccountZipcode() {
        return accountZipcode;
    }

    public void setAccountZipcode(String accountZipcode) {
        this.accountZipcode = accountZipcode;
    }

    public String getAccountCountry() {
        return accountCountry;
    }

    public void setAccountCountry(String accountCountry) {
        this.accountCountry = accountCountry;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountPhone() {
        return accountPhone;
    }

    public void setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
    }

    public Boolean getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    @XmlTransient
    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountId != null ? accountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.accountId == null && other.accountId != null) || (this.accountId != null && !this.accountId.equals(other.accountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aptech.elevation.entity.Account[ accountId=" + accountId + " ]";
    }
    
}

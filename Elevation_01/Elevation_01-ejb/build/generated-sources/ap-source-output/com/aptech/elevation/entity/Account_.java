package com.aptech.elevation.entity;

import com.aptech.elevation.entity.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-05T00:02:29")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> accountCity;
    public static volatile SingularAttribute<Account, String> accountStates;
    public static volatile SingularAttribute<Account, String> accountCompany;
    public static volatile SingularAttribute<Account, Integer> rolesId;
    public static volatile SingularAttribute<Account, String> accountZipcode;
    public static volatile SingularAttribute<Account, String> accountCountry;
    public static volatile SingularAttribute<Account, String> accountAddress2;
    public static volatile SingularAttribute<Account, String> accountAddress1;
    public static volatile SingularAttribute<Account, Boolean> accountStatus;
    public static volatile SingularAttribute<Account, Integer> accountId;
    public static volatile SingularAttribute<Account, String> accountFirstname;
    public static volatile SingularAttribute<Account, String> accountEmail;
    public static volatile SingularAttribute<Account, String> accountLastname;
    public static volatile SingularAttribute<Account, String> accountPhone;
    public static volatile SingularAttribute<Account, String> accountUsername;
    public static volatile SingularAttribute<Account, String> accountPassword;
    public static volatile ListAttribute<Account, Orders> ordersList;

}
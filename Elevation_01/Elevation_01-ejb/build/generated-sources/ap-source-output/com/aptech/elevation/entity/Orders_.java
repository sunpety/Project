package com.aptech.elevation.entity;

import com.aptech.elevation.entity.Account;
import com.aptech.elevation.entity.Complaints;
import com.aptech.elevation.entity.OrdersDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-08T04:27:18")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, String> locationStates;
    public static volatile SingularAttribute<Orders, String> locationZipcode;
    public static volatile ListAttribute<Orders, OrdersDetails> ordersDetailsList;
    public static volatile SingularAttribute<Orders, Integer> orderId;
    public static volatile ListAttribute<Orders, Complaints> complaintsList;
    public static volatile SingularAttribute<Orders, Date> orderDateConstruction;
    public static volatile SingularAttribute<Orders, String> locationPhone;
    public static volatile SingularAttribute<Orders, String> enqury;
    public static volatile SingularAttribute<Orders, String> orderStatus;
    public static volatile SingularAttribute<Orders, String> locationAddress;
    public static volatile SingularAttribute<Orders, String> orderPayment;
    public static volatile SingularAttribute<Orders, Account> accountId;
    public static volatile SingularAttribute<Orders, String> locationCountry;
    public static volatile SingularAttribute<Orders, Date> orderDate;
    public static volatile SingularAttribute<Orders, String> locationCity;
    public static volatile SingularAttribute<Orders, String> locationEmail;

}
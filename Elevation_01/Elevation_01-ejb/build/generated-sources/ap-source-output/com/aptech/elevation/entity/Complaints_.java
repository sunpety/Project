package com.aptech.elevation.entity;

import com.aptech.elevation.entity.Orders;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-06T09:40:34")
@StaticMetamodel(Complaints.class)
public class Complaints_ { 

    public static volatile SingularAttribute<Complaints, String> complaintsDescription;
    public static volatile SingularAttribute<Complaints, Orders> orderId;
    public static volatile SingularAttribute<Complaints, Date> complaintsDate;
    public static volatile SingularAttribute<Complaints, String> complaintsTitle;
    public static volatile SingularAttribute<Complaints, Integer> complaintsId;
    public static volatile SingularAttribute<Complaints, Boolean> complaintsStatus;

}
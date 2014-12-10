package com.aptech.elevation.entity;

import com.aptech.elevation.entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-10T10:39:56")
@StaticMetamodel(Feedbacks.class)
public class Feedbacks_ { 

    public static volatile SingularAttribute<Feedbacks, String> feedbackDescription;
    public static volatile SingularAttribute<Feedbacks, Date> feedbackDate;
    public static volatile SingularAttribute<Feedbacks, Integer> feedbackId;
    public static volatile SingularAttribute<Feedbacks, String> feedbackFullname;
    public static volatile ListAttribute<Feedbacks, Product> productList;
    public static volatile SingularAttribute<Feedbacks, Boolean> feedbackStatus;
    public static volatile SingularAttribute<Feedbacks, String> feedbackEmail;

}
package com.aptech.elevation.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-05T05:58:29")
@StaticMetamodel(News.class)
public class News_ { 

    public static volatile SingularAttribute<News, String> newTitle;
    public static volatile SingularAttribute<News, Integer> newType;
    public static volatile SingularAttribute<News, String> newConten;
    public static volatile SingularAttribute<News, Boolean> newStatus;
    public static volatile SingularAttribute<News, Integer> newId;
    public static volatile SingularAttribute<News, Date> newDate;

}
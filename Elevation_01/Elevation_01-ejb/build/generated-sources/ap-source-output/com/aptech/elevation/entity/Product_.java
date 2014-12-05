package com.aptech.elevation.entity;

import com.aptech.elevation.entity.Category;
import com.aptech.elevation.entity.OrdersDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-05T15:17:45")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> productQuantity;
    public static volatile SingularAttribute<Product, String> productImage;
    public static volatile ListAttribute<Product, OrdersDetails> ordersDetailsList;
    public static volatile SingularAttribute<Product, Integer> productId;
    public static volatile SingularAttribute<Product, Double> productDiscount;
    public static volatile SingularAttribute<Product, Boolean> productStatus;
    public static volatile SingularAttribute<Product, String> productName;
    public static volatile SingularAttribute<Product, Double> productPrice;
    public static volatile SingularAttribute<Product, String> productDescription;
    public static volatile SingularAttribute<Product, Date> productCreatedate;
    public static volatile SingularAttribute<Product, Category> categoryId;

}
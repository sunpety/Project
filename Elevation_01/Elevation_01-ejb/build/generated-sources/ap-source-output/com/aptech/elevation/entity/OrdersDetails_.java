package com.aptech.elevation.entity;

import com.aptech.elevation.entity.Orders;
import com.aptech.elevation.entity.OrdersDetailsPK;
import com.aptech.elevation.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-10T10:39:56")
@StaticMetamodel(OrdersDetails.class)
public class OrdersDetails_ { 

    public static volatile SingularAttribute<OrdersDetails, OrdersDetailsPK> ordersDetailsPK;
    public static volatile SingularAttribute<OrdersDetails, Double> orderDetailPrice;
    public static volatile SingularAttribute<OrdersDetails, Product> product;
    public static volatile SingularAttribute<OrdersDetails, Orders> orders;
    public static volatile SingularAttribute<OrdersDetails, Integer> orderDetailQuantity;
    public static volatile SingularAttribute<OrdersDetails, Double> orderDetailDiscountProduct;

}
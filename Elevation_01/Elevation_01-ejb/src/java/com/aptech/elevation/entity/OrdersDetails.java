/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NeedMoney
 */
@Entity
@Table(name = "orders_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdersDetails.findAll", query = "SELECT o FROM OrdersDetails o"),
    @NamedQuery(name = "OrdersDetails.findByOrderId", query = "SELECT o FROM OrdersDetails o WHERE o.ordersDetailsPK.orderId = :orderId"),
    @NamedQuery(name = "OrdersDetails.findByProductId", query = "SELECT o FROM OrdersDetails o WHERE o.ordersDetailsPK.productId = :productId"),
    @NamedQuery(name = "OrdersDetails.findByOrderDetailQuantity", query = "SELECT o FROM OrdersDetails o WHERE o.orderDetailQuantity = :orderDetailQuantity"),
    @NamedQuery(name = "OrdersDetails.findByOrderDetailDiscountProduct", query = "SELECT o FROM OrdersDetails o WHERE o.orderDetailDiscountProduct = :orderDetailDiscountProduct"),
    @NamedQuery(name = "OrdersDetails.findByOrderDetailPrice", query = "SELECT o FROM OrdersDetails o WHERE o.orderDetailPrice = :orderDetailPrice")})
public class OrdersDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrdersDetailsPK ordersDetailsPK;
    @Column(name = "order_detail_quantity")
    private Integer orderDetailQuantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "order_detail_discount_product")
    private Double orderDetailDiscountProduct;
    @Column(name = "order_detail_price")
    private Double orderDetailPrice;
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Orders orders;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public OrdersDetails() {
    }

    public OrdersDetails(OrdersDetailsPK ordersDetailsPK) {
        this.ordersDetailsPK = ordersDetailsPK;
    }

    public OrdersDetails(int orderId, int productId) {
        this.ordersDetailsPK = new OrdersDetailsPK(orderId, productId);
    }

    public OrdersDetailsPK getOrdersDetailsPK() {
        return ordersDetailsPK;
    }

    public void setOrdersDetailsPK(OrdersDetailsPK ordersDetailsPK) {
        this.ordersDetailsPK = ordersDetailsPK;
    }

    public Integer getOrderDetailQuantity() {
        return orderDetailQuantity;
    }

    public void setOrderDetailQuantity(Integer orderDetailQuantity) {
        this.orderDetailQuantity = orderDetailQuantity;
    }

    public Double getOrderDetailDiscountProduct() {
        return orderDetailDiscountProduct;
    }

    public void setOrderDetailDiscountProduct(Double orderDetailDiscountProduct) {
        this.orderDetailDiscountProduct = orderDetailDiscountProduct;
    }

    public Double getOrderDetailPrice() {
        return orderDetailPrice;
    }

    public void setOrderDetailPrice(Double orderDetailPrice) {
        this.orderDetailPrice = orderDetailPrice;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordersDetailsPK != null ? ordersDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdersDetails)) {
            return false;
        }
        OrdersDetails other = (OrdersDetails) object;
        if ((this.ordersDetailsPK == null && other.ordersDetailsPK != null) || (this.ordersDetailsPK != null && !this.ordersDetailsPK.equals(other.ordersDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aptech.elevation.entity.OrdersDetails[ ordersDetailsPK=" + ordersDetailsPK + " ]";
    }
    
}

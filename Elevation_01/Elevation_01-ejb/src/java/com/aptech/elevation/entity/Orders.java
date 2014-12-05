/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NeedMoney
 */
@Entity
@Table(name = "orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByOrderId", query = "SELECT o FROM Orders o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "Orders.findByLocationAddress", query = "SELECT o FROM Orders o WHERE o.locationAddress = :locationAddress"),
    @NamedQuery(name = "Orders.findByLocationCity", query = "SELECT o FROM Orders o WHERE o.locationCity = :locationCity"),
    @NamedQuery(name = "Orders.findByLocationStates", query = "SELECT o FROM Orders o WHERE o.locationStates = :locationStates"),
    @NamedQuery(name = "Orders.findByLocationZipcode", query = "SELECT o FROM Orders o WHERE o.locationZipcode = :locationZipcode"),
    @NamedQuery(name = "Orders.findByLocationCountry", query = "SELECT o FROM Orders o WHERE o.locationCountry = :locationCountry"),
    @NamedQuery(name = "Orders.findByLocationPhone", query = "SELECT o FROM Orders o WHERE o.locationPhone = :locationPhone"),
    @NamedQuery(name = "Orders.findByLocationEmail", query = "SELECT o FROM Orders o WHERE o.locationEmail = :locationEmail"),
    @NamedQuery(name = "Orders.findByEnqury", query = "SELECT o FROM Orders o WHERE o.enqury = :enqury"),
    @NamedQuery(name = "Orders.findByOrderStatus", query = "SELECT o FROM Orders o WHERE o.orderStatus = :orderStatus"),
    @NamedQuery(name = "Orders.findByOrderPayment", query = "SELECT o FROM Orders o WHERE o.orderPayment = :orderPayment"),
    @NamedQuery(name = "Orders.findByOrderDateConstruction", query = "SELECT o FROM Orders o WHERE o.orderDateConstruction = :orderDateConstruction"),
    @NamedQuery(name = "Orders.findByOrderDate", query = "SELECT o FROM Orders o WHERE o.orderDate = :orderDate")})
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;
    @Size(max = 100)
    @Column(name = "location_address")
    private String locationAddress;
    @Size(max = 50)
    @Column(name = "location_city")
    private String locationCity;
    @Size(max = 50)
    @Column(name = "location_states")
    private String locationStates;
    @Size(max = 50)
    @Column(name = "location_zipcode")
    private String locationZipcode;
    @Size(max = 50)
    @Column(name = "location_country")
    private String locationCountry;
    @Size(max = 30)
    @Column(name = "location_phone")
    private String locationPhone;
    @Size(max = 30)
    @Column(name = "location_email")
    private String locationEmail;
    @Size(max = 2147483647)
    @Column(name = "enqury")
    private String enqury;
    @Size(max = 50)
    @Column(name = "order_status")
    private String orderStatus;
    @Size(max = 100)
    @Column(name = "order_payment")
    private String orderPayment;
    @Column(name = "order_date_construction")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDateConstruction;
    @Column(name = "order_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orders")
    private List<OrdersDetails> ordersDetailsList;
    @OneToMany(mappedBy = "orderId")
    private List<Complaints> complaintsList;
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    @ManyToOne
    private Account accountId;

    public Orders() {
    }

    public Orders(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationStates() {
        return locationStates;
    }

    public void setLocationStates(String locationStates) {
        this.locationStates = locationStates;
    }

    public String getLocationZipcode() {
        return locationZipcode;
    }

    public void setLocationZipcode(String locationZipcode) {
        this.locationZipcode = locationZipcode;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public String getLocationPhone() {
        return locationPhone;
    }

    public void setLocationPhone(String locationPhone) {
        this.locationPhone = locationPhone;
    }

    public String getLocationEmail() {
        return locationEmail;
    }

    public void setLocationEmail(String locationEmail) {
        this.locationEmail = locationEmail;
    }

    public String getEnqury() {
        return enqury;
    }

    public void setEnqury(String enqury) {
        this.enqury = enqury;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(String orderPayment) {
        this.orderPayment = orderPayment;
    }

    public Date getOrderDateConstruction() {
        return orderDateConstruction;
    }

    public void setOrderDateConstruction(Date orderDateConstruction) {
        this.orderDateConstruction = orderDateConstruction;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @XmlTransient
    public List<OrdersDetails> getOrdersDetailsList() {
        return ordersDetailsList;
    }

    public void setOrdersDetailsList(List<OrdersDetails> ordersDetailsList) {
        this.ordersDetailsList = ordersDetailsList;
    }

    @XmlTransient
    public List<Complaints> getComplaintsList() {
        return complaintsList;
    }

    public void setComplaintsList(List<Complaints> complaintsList) {
        this.complaintsList = complaintsList;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aptech.elevation.entity.Orders[ orderId=" + orderId + " ]";
    }
    
}

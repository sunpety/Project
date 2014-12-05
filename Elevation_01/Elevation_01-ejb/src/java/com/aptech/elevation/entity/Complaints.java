/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NeedMoney
 */
@Entity
@Table(name = "complaints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Complaints.findAll", query = "SELECT c FROM Complaints c"),
    @NamedQuery(name = "Complaints.findByComplaintsId", query = "SELECT c FROM Complaints c WHERE c.complaintsId = :complaintsId"),
    @NamedQuery(name = "Complaints.findByComplaintsTitle", query = "SELECT c FROM Complaints c WHERE c.complaintsTitle = :complaintsTitle"),
    @NamedQuery(name = "Complaints.findByComplaintsDescription", query = "SELECT c FROM Complaints c WHERE c.complaintsDescription = :complaintsDescription"),
    @NamedQuery(name = "Complaints.findByComplaintsStatus", query = "SELECT c FROM Complaints c WHERE c.complaintsStatus = :complaintsStatus"),
    @NamedQuery(name = "Complaints.findByComplaintsDate", query = "SELECT c FROM Complaints c WHERE c.complaintsDate = :complaintsDate")})
public class Complaints implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complaints_id")
    private Integer complaintsId;
    @Size(max = 200)
    @Column(name = "complaints_title")
    private String complaintsTitle;
    @Size(max = 2147483647)
    @Column(name = "complaints_description")
    private String complaintsDescription;
    @Column(name = "complaints_status")
    private Boolean complaintsStatus;
    @Column(name = "complaints_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date complaintsDate;
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    @ManyToOne
    private Orders orderId;

    public Complaints() {
    }

    public Complaints(Integer complaintsId) {
        this.complaintsId = complaintsId;
    }

    public Integer getComplaintsId() {
        return complaintsId;
    }

    public void setComplaintsId(Integer complaintsId) {
        this.complaintsId = complaintsId;
    }

    public String getComplaintsTitle() {
        return complaintsTitle;
    }

    public void setComplaintsTitle(String complaintsTitle) {
        this.complaintsTitle = complaintsTitle;
    }

    public String getComplaintsDescription() {
        return complaintsDescription;
    }

    public void setComplaintsDescription(String complaintsDescription) {
        this.complaintsDescription = complaintsDescription;
    }

    public Boolean getComplaintsStatus() {
        return complaintsStatus;
    }

    public void setComplaintsStatus(Boolean complaintsStatus) {
        this.complaintsStatus = complaintsStatus;
    }

    public Date getComplaintsDate() {
        return complaintsDate;
    }

    public void setComplaintsDate(Date complaintsDate) {
        this.complaintsDate = complaintsDate;
    }

    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (complaintsId != null ? complaintsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Complaints)) {
            return false;
        }
        Complaints other = (Complaints) object;
        if ((this.complaintsId == null && other.complaintsId != null) || (this.complaintsId != null && !this.complaintsId.equals(other.complaintsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aptech.elevation.entity.Complaints[ complaintsId=" + complaintsId + " ]";
    }
    
}

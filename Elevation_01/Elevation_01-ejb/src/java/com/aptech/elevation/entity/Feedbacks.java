/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NeedMoney
 */
@Entity
@Table(name = "feedbacks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Feedbacks.findAll", query = "SELECT f FROM Feedbacks f"),
    @NamedQuery(name = "Feedbacks.findByFeedbackId", query = "SELECT f FROM Feedbacks f WHERE f.feedbackId = :feedbackId"),
    @NamedQuery(name = "Feedbacks.findByFeedbackFullname", query = "SELECT f FROM Feedbacks f WHERE f.feedbackFullname = :feedbackFullname"),
    @NamedQuery(name = "Feedbacks.findByFeedbackEmail", query = "SELECT f FROM Feedbacks f WHERE f.feedbackEmail = :feedbackEmail"),
    @NamedQuery(name = "Feedbacks.findByFeedbackDescription", query = "SELECT f FROM Feedbacks f WHERE f.feedbackDescription = :feedbackDescription"),
    @NamedQuery(name = "Feedbacks.findByFeedbackStatus", query = "SELECT f FROM Feedbacks f WHERE f.feedbackStatus = :feedbackStatus"),
    @NamedQuery(name = "Feedbacks.findByFeedbackDate", query = "SELECT f FROM Feedbacks f WHERE f.feedbackDate = :feedbackDate")})
public class Feedbacks implements Serializable {

    @OneToMany(mappedBy = "feedbackId")
    private List<Product> productList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private Integer feedbackId;
    @Size(max = 100)
    @Column(name = "feedback_fullname")
    private String feedbackFullname;
    @Size(max = 100)
    @Column(name = "feedback_email")
    private String feedbackEmail;
    @Size(max = 2147483647)
    @Column(name = "feedback_description")
    private String feedbackDescription;
    @Column(name = "feedback_status")
    private Boolean feedbackStatus;
    @Column(name = "feedback_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feedbackDate;

    public Feedbacks() {
    }

    public Feedbacks(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedbackFullname() {
        return feedbackFullname;
    }

    public void setFeedbackFullname(String feedbackFullname) {
        this.feedbackFullname = feedbackFullname;
    }

    public String getFeedbackEmail() {
        return feedbackEmail;
    }

    public void setFeedbackEmail(String feedbackEmail) {
        this.feedbackEmail = feedbackEmail;
    }

    public String getFeedbackDescription() {
        return feedbackDescription;
    }

    public void setFeedbackDescription(String feedbackDescription) {
        this.feedbackDescription = feedbackDescription;
    }

    public Boolean getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(Boolean feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedbackId != null ? feedbackId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedbacks)) {
            return false;
        }
        Feedbacks other = (Feedbacks) object;
        if ((this.feedbackId == null && other.feedbackId != null) || (this.feedbackId != null && !this.feedbackId.equals(other.feedbackId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aptech.elevation.entity.Feedbacks[ feedbackId=" + feedbackId + " ]";
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

}

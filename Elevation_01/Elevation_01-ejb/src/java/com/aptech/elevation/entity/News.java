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
@Table(name = "news")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "News.findAll", query = "SELECT n FROM News n"),
    @NamedQuery(name = "News.findByNewId", query = "SELECT n FROM News n WHERE n.newId = :newId"),
    @NamedQuery(name = "News.findByNewType", query = "SELECT n FROM News n WHERE n.newType = :newType"),
    @NamedQuery(name = "News.findByNewTitle", query = "SELECT n FROM News n WHERE n.newTitle = :newTitle"),
    @NamedQuery(name = "News.findByNewConten", query = "SELECT n FROM News n WHERE n.newConten = :newConten"),
    @NamedQuery(name = "News.findByNewStatus", query = "SELECT n FROM News n WHERE n.newStatus = :newStatus"),
    @NamedQuery(name = "News.findByNewDate", query = "SELECT n FROM News n WHERE n.newDate = :newDate")})
public class News implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "new_id")
    private Integer newId;
    @Column(name = "new_type")
    private Integer newType;
    @Size(max = 200)
    @Column(name = "new_title")
    private String newTitle;
    @Size(max = 2147483647)
    @Column(name = "new_conten")
    private String newConten;
    @Column(name = "new_status")
    private Boolean newStatus;
    @Column(name = "new_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date newDate;

    public News() {
    }

    public News(Integer newId) {
        this.newId = newId;
    }

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public Integer getNewType() {
        return newType;
    }

    public void setNewType(Integer newType) {
        this.newType = newType;
    }

    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle;
    }

    public String getNewConten() {
        return newConten;
    }

    public void setNewConten(String newConten) {
        this.newConten = newConten;
    }

    public Boolean getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Boolean newStatus) {
        this.newStatus = newStatus;
    }

    public Date getNewDate() {
        return newDate;
    }

    public void setNewDate(Date newDate) {
        this.newDate = newDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (newId != null ? newId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof News)) {
            return false;
        }
        News other = (News) object;
        if ((this.newId == null && other.newId != null) || (this.newId != null && !this.newId.equals(other.newId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aptech.elevation.entity.News[ newId=" + newId + " ]";
    }
    
}

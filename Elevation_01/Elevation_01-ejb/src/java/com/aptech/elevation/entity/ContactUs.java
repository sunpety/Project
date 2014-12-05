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
@Table(name = "contact_us")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContactUs.findAll", query = "SELECT c FROM ContactUs c"),
    @NamedQuery(name = "ContactUs.findByContactId", query = "SELECT c FROM ContactUs c WHERE c.contactId = :contactId"),
    @NamedQuery(name = "ContactUs.findByContactWebsiteOffice", query = "SELECT c FROM ContactUs c WHERE c.contactWebsiteOffice = :contactWebsiteOffice"),
    @NamedQuery(name = "ContactUs.findByContactWebsiteAddress", query = "SELECT c FROM ContactUs c WHERE c.contactWebsiteAddress = :contactWebsiteAddress"),
    @NamedQuery(name = "ContactUs.findByContactWebsitePhone", query = "SELECT c FROM ContactUs c WHERE c.contactWebsitePhone = :contactWebsitePhone"),
    @NamedQuery(name = "ContactUs.findByContactWebsiteFax", query = "SELECT c FROM ContactUs c WHERE c.contactWebsiteFax = :contactWebsiteFax"),
    @NamedQuery(name = "ContactUs.findByContactWebsiteEmail", query = "SELECT c FROM ContactUs c WHERE c.contactWebsiteEmail = :contactWebsiteEmail"),
    @NamedQuery(name = "ContactUs.findByContactTitle", query = "SELECT c FROM ContactUs c WHERE c.contactTitle = :contactTitle"),
    @NamedQuery(name = "ContactUs.findByContactFullname", query = "SELECT c FROM ContactUs c WHERE c.contactFullname = :contactFullname"),
    @NamedQuery(name = "ContactUs.findByContactEmail", query = "SELECT c FROM ContactUs c WHERE c.contactEmail = :contactEmail"),
    @NamedQuery(name = "ContactUs.findByContactConten", query = "SELECT c FROM ContactUs c WHERE c.contactConten = :contactConten"),
    @NamedQuery(name = "ContactUs.findByContactDate", query = "SELECT c FROM ContactUs c WHERE c.contactDate = :contactDate")})
public class ContactUs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Integer contactId;
    @Size(max = 100)
    @Column(name = "contact_website_office")
    private String contactWebsiteOffice;
    @Size(max = 200)
    @Column(name = "contact_website_address")
    private String contactWebsiteAddress;
    @Size(max = 100)
    @Column(name = "contact_website_phone")
    private String contactWebsitePhone;
    @Size(max = 100)
    @Column(name = "contact_website_fax")
    private String contactWebsiteFax;
    @Size(max = 100)
    @Column(name = "contact_website_email")
    private String contactWebsiteEmail;
    @Size(max = 200)
    @Column(name = "contact_title")
    private String contactTitle;
    @Size(max = 100)
    @Column(name = "contact_fullname")
    private String contactFullname;
    @Size(max = 100)
    @Column(name = "contact_email")
    private String contactEmail;
    @Size(max = 2147483647)
    @Column(name = "contact_conten")
    private String contactConten;
    @Column(name = "contact_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date contactDate;

    public ContactUs() {
    }

    public ContactUs(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getContactWebsiteOffice() {
        return contactWebsiteOffice;
    }

    public void setContactWebsiteOffice(String contactWebsiteOffice) {
        this.contactWebsiteOffice = contactWebsiteOffice;
    }

    public String getContactWebsiteAddress() {
        return contactWebsiteAddress;
    }

    public void setContactWebsiteAddress(String contactWebsiteAddress) {
        this.contactWebsiteAddress = contactWebsiteAddress;
    }

    public String getContactWebsitePhone() {
        return contactWebsitePhone;
    }

    public void setContactWebsitePhone(String contactWebsitePhone) {
        this.contactWebsitePhone = contactWebsitePhone;
    }

    public String getContactWebsiteFax() {
        return contactWebsiteFax;
    }

    public void setContactWebsiteFax(String contactWebsiteFax) {
        this.contactWebsiteFax = contactWebsiteFax;
    }

    public String getContactWebsiteEmail() {
        return contactWebsiteEmail;
    }

    public void setContactWebsiteEmail(String contactWebsiteEmail) {
        this.contactWebsiteEmail = contactWebsiteEmail;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactFullname() {
        return contactFullname;
    }

    public void setContactFullname(String contactFullname) {
        this.contactFullname = contactFullname;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactConten() {
        return contactConten;
    }

    public void setContactConten(String contactConten) {
        this.contactConten = contactConten;
    }

    public Date getContactDate() {
        return contactDate;
    }

    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactId != null ? contactId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactUs)) {
            return false;
        }
        ContactUs other = (ContactUs) object;
        if ((this.contactId == null && other.contactId != null) || (this.contactId != null && !this.contactId.equals(other.contactId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aptech.elevation.entity.ContactUs[ contactId=" + contactId + " ]";
    }
    
}

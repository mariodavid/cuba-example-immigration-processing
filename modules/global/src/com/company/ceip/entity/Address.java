package com.company.ceip.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s, %s %s|street,postCode,city")
@Table(name = "CEIP_ADDRESS")
@Entity(name = "ceip$Address")
public class Address extends StandardEntity {
    private static final long serialVersionUID = -2884499552873369396L;

    @Column(name = "STREET")
    protected String street;

    @Column(name = "POST_CODE")
    protected String postCode;

    @Column(name = "CITY")
    protected String city;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "APPLICANT_ID")
    protected Applicant applicant;

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Applicant getApplicant() {
        return applicant;
    }


    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }


}
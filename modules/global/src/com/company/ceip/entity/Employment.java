package com.company.ceip.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|employer")
@Table(name = "CEIP_EMPLOYMENT")
@Entity(name = "ceip$Employment")
public class Employment extends StandardEntity {
    private static final long serialVersionUID = 2640682002674383238L;

    @Column(name = "EMPLOYER")
    protected String employer;

    @Temporal(TemporalType.DATE)
    @Column(name = "EMPLOYED_FROM")
    protected Date employedFrom;

    @Temporal(TemporalType.DATE)
    @Column(name = "EMPLOYED_UNTIL")
    protected Date employedUntil;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "APPLICANT_ID")
    protected Applicant applicant;

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Applicant getApplicant() {
        return applicant;
    }


    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployedFrom(Date employedFrom) {
        this.employedFrom = employedFrom;
    }

    public Date getEmployedFrom() {
        return employedFrom;
    }

    public void setEmployedUntil(Date employedUntil) {
        this.employedUntil = employedUntil;
    }

    public Date getEmployedUntil() {
        return employedUntil;
    }


}
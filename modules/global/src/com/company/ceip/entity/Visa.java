package com.company.ceip.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "CEIP_VISA")
@Entity(name = "ceip$Visa")
public class Visa extends StandardEntity {
    private static final long serialVersionUID = -4924226064584137061L;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_FROM")
    protected Date validFrom;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_UNTIL")
    protected Date validUntil;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "APPLICANT_ID")
    protected Applicant applicant;

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Applicant getApplicant() {
        return applicant;
    }


    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public Date getValidUntil() {
        return validUntil;
    }


}
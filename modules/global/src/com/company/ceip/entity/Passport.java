package com.company.ceip.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|passportId")
@Table(name = "CEIP_PASSPORT")
@Entity(name = "ceip$Passport")
public class Passport extends StandardEntity {
    private static final long serialVersionUID = -7565787900786554469L;

    @NotNull
    @Column(name = "PASSPORT_ID", nullable = false)
    protected String passportId;

    @Column(name = "HOLDER")
    protected String holder;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "APPLICANT_ID")
    protected Applicant applicant;

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Applicant getApplicant() {
        return applicant;
    }


    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }


}
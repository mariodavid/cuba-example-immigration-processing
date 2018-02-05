package com.company.ceip.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|school")
@Table(name = "CEIP_EDUCATION")
@Entity(name = "ceip$Education")
public class Education extends StandardEntity {
    private static final long serialVersionUID = 8950693745606477661L;

    @Column(name = "SCHOOL")
    protected String school;

    @Column(name = "GRADUATION")
    protected String graduation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "APPLICANT_ID")
    protected Applicant applicant;

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Applicant getApplicant() {
        return applicant;
    }


    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String getGraduation() {
        return graduation;
    }


}
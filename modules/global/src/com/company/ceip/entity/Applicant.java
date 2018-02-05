package com.company.ceip.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.Column;

@Table(name = "CEIP_APPLICANT")
@Entity(name = "ceip$Applicant")
public class Applicant extends StandardEntity {
    private static final long serialVersionUID = -2015496025679584963L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MATTER_ID")
    protected Matter matter;


    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "applicant")
    protected List<Visa> visa;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "applicant")
    protected List<Passport> passports;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "applicant")
    protected List<Address> addresses;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "applicant")
    protected List<Employment> employments;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "applicant")
    protected List<Education> educations;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setVisa(List<Visa> visa) {
        this.visa = visa;
    }

    public List<Visa> getVisa() {
        return visa;
    }

    public void setPassports(List<Passport> passports) {
        this.passports = passports;
    }

    public List<Passport> getPassports() {
        return passports;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setEmployments(List<Employment> employments) {
        this.employments = employments;
    }

    public List<Employment> getEmployments() {
        return employments;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Education> getEducations() {
        return educations;
    }


    public void setMatter(Matter matter) {
        this.matter = matter;
    }

    public Matter getMatter() {
        return matter;
    }


}
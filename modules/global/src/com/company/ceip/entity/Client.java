package com.company.ceip.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|name")
@Table(name = "CEIP_CLIENT")
@Entity(name = "ceip$Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 9073915733747486708L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;


    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "client")
    protected List<Matter> matters;

    public void setMatters(List<Matter> matters) {
        this.matters = matters;
    }

    public List<Matter> getMatters() {
        return matters;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
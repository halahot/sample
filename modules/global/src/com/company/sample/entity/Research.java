package com.company.sample.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "SAMPLE_RESEARCH")
@Entity(name = "sample_Research")
public class Research extends StandardEntity
{
    private static final long serialVersionUID = 3353863050236475603L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "STATUS")
    protected String status;

    public Status getStatus()
    {
        return status == null ? null : Status.fromId(status);
    }

    public void setStatus(Status status)
    {
        this.status = status == null ? null : status.getId();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
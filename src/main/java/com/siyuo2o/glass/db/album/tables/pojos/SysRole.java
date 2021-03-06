/*
 * This file is generated by jOOQ.
 */
package com.siyuo2o.glass.db.album.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysRole implements Serializable {

    private static final long serialVersionUID = 871949891;

    private Integer id;
    private Boolean available;
    private String  description;
    private String  role;

    public SysRole() {}

    public SysRole(SysRole value) {
        this.id = value.id;
        this.available = value.available;
        this.description = value.description;
        this.role = value.role;
    }

    public SysRole(
        Integer id,
        Boolean available,
        String  description,
        String  role
    ) {
        this.id = id;
        this.available = available;
        this.description = description;
        this.role = role;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysRole (");

        sb.append(id);
        sb.append(", ").append(available);
        sb.append(", ").append(description);
        sb.append(", ").append(role);

        sb.append(")");
        return sb.toString();
    }
}

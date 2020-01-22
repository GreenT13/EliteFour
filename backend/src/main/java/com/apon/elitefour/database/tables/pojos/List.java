/*
 * This file is generated by jOOQ.
 */
package com.apon.elitefour.database.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class List implements Serializable {

    private static final long serialVersionUID = 9343452;

    private final Integer id;
    private final String  name;
    private final Integer statusId;
    private final Integer sizechoice;

    public List(List value) {
        this.id = value.id;
        this.name = value.name;
        this.statusId = value.statusId;
        this.sizechoice = value.sizechoice;
    }

    public List(
        Integer id,
        String  name,
        Integer statusId,
        Integer sizechoice
    ) {
        this.id = id;
        this.name = name;
        this.statusId = statusId;
        this.sizechoice = sizechoice;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getStatusId() {
        return this.statusId;
    }

    public Integer getSizechoice() {
        return this.sizechoice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("List (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(statusId);
        sb.append(", ").append(sizechoice);

        sb.append(")");
        return sb.toString();
    }
}
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
public class ListItem implements Serializable {

    private static final long serialVersionUID = -1881807597;

    private final Integer id;
    private final String  name;
    private final Integer listId;
    private final Integer rank;
    private final Boolean isChosen;

    public ListItem(ListItem value) {
        this.id = value.id;
        this.name = value.name;
        this.listId = value.listId;
        this.rank = value.rank;
        this.isChosen = value.isChosen;
    }

    public ListItem(
        Integer id,
        String  name,
        Integer listId,
        Integer rank,
        Boolean isChosen
    ) {
        this.id = id;
        this.name = name;
        this.listId = listId;
        this.rank = rank;
        this.isChosen = isChosen;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getListId() {
        return this.listId;
    }

    public Integer getRank() {
        return this.rank;
    }

    public Boolean getIsChosen() {
        return this.isChosen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ListItem (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(listId);
        sb.append(", ").append(rank);
        sb.append(", ").append(isChosen);

        sb.append(")");
        return sb.toString();
    }
}
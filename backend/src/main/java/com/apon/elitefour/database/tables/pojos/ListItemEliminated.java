/*
 * This file is generated by jOOQ.
 */
package com.apon.elitefour.database.tables.pojos;


import javax.annotation.processing.Generated;
import java.io.Serializable;


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
public class ListItemEliminated implements Serializable {

    private static final long serialVersionUID = -124260383;

    private final Integer itemId;
    private final Integer eliminatedItemId;

    public ListItemEliminated(ListItemEliminated value) {
        this.itemId = value.itemId;
        this.eliminatedItemId = value.eliminatedItemId;
    }

    public ListItemEliminated(
        Integer itemId,
        Integer eliminatedItemId
    ) {
        this.itemId = itemId;
        this.eliminatedItemId = eliminatedItemId;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getEliminatedItemId() {
        return this.eliminatedItemId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ListItemEliminated (");

        sb.append(itemId);
        sb.append(", ").append(eliminatedItemId);

        sb.append(")");
        return sb.toString();
    }
}

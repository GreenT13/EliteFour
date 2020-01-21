/*
 * This file is generated by jOOQ.
 */
package com.apon.elitefour.database.tables.records;


import com.apon.elitefour.database.tables.ListItem;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

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
public class ListItemRecord extends UpdatableRecordImpl<ListItemRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 954467490;

    /**
     * Setter for <code>public.list_item.id</code>.
     */
    public ListItemRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.list_item.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.list_item.name</code>.
     */
    public ListItemRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.list_item.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.list_item.list_id</code>.
     */
    public ListItemRecord setListId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.list_item.list_id</code>.
     */
    public Integer getListId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ListItem.LIST_ITEM.ID;
    }

    @Override
    public Field<String> field2() {
        return ListItem.LIST_ITEM.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return ListItem.LIST_ITEM.LIST_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getListId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getListId();
    }

    @Override
    public ListItemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ListItemRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ListItemRecord value3(Integer value) {
        setListId(value);
        return this;
    }

    @Override
    public ListItemRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ListItemRecord
     */
    public ListItemRecord() {
        super(ListItem.LIST_ITEM);
    }

    /**
     * Create a detached, initialised ListItemRecord
     */
    public ListItemRecord(Integer id, String name, Integer listId) {
        super(ListItem.LIST_ITEM);

        set(0, id);
        set(1, name);
        set(2, listId);
    }
}

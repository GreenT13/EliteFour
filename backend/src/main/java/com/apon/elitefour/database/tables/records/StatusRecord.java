/*
 * This file is generated by jOOQ.
 */
package com.apon.elitefour.database.tables.records;


import com.apon.elitefour.database.tables.Status;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class StatusRecord extends UpdatableRecordImpl<StatusRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1701616569;

    /**
     * Setter for <code>public.status.id</code>.
     */
    public StatusRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.status.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.status.name</code>.
     */
    public StatusRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.status.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Status.STATUS.ID;
    }

    @Override
    public Field<String> field2() {
        return Status.STATUS.NAME;
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
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public StatusRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public StatusRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public StatusRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatusRecord
     */
    public StatusRecord() {
        super(Status.STATUS);
    }

    /**
     * Create a detached, initialised StatusRecord
     */
    public StatusRecord(Integer id, String name) {
        super(Status.STATUS);

        set(0, id);
        set(1, name);
    }
}

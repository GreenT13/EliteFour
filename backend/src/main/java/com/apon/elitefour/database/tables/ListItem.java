/*
 * This file is generated by jOOQ.
 */
package com.apon.elitefour.database.tables;


import com.apon.elitefour.database.Indexes;
import com.apon.elitefour.database.Keys;
import com.apon.elitefour.database.Public;
import com.apon.elitefour.database.tables.records.ListItemRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ListItem extends TableImpl<ListItemRecord> {

    private static final long serialVersionUID = 1543199252;

    /**
     * The reference instance of <code>public.list_item</code>
     */
    public static final ListItem LIST_ITEM = new ListItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ListItemRecord> getRecordType() {
        return ListItemRecord.class;
    }

    /**
     * The column <code>public.list_item.id</code>.
     */
    public final TableField<ListItemRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.list_item.name</code>.
     */
    public final TableField<ListItemRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(80).nullable(false), this, "");

    /**
     * The column <code>public.list_item.list_id</code>.
     */
    public final TableField<ListItemRecord, Integer> LIST_ID = createField(DSL.name("list_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.list_item.rank</code>.
     */
    public final TableField<ListItemRecord, Integer> RANK = createField(DSL.name("rank"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.list_item.is_chosen</code>.
     */
    public final TableField<ListItemRecord, Boolean> IS_CHOSEN = createField(DSL.name("is_chosen"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>public.list_item</code> table reference
     */
    public ListItem() {
        this(DSL.name("list_item"), null);
    }

    /**
     * Create an aliased <code>public.list_item</code> table reference
     */
    public ListItem(String alias) {
        this(DSL.name(alias), LIST_ITEM);
    }

    /**
     * Create an aliased <code>public.list_item</code> table reference
     */
    public ListItem(Name alias) {
        this(alias, LIST_ITEM);
    }

    private ListItem(Name alias, Table<ListItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private ListItem(Name alias, Table<ListItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ListItem(Table<O> child, ForeignKey<O, ListItemRecord> key) {
        super(child, key, LIST_ITEM);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LIST_ITEM_PKEY);
    }

    @Override
    public UniqueKey<ListItemRecord> getPrimaryKey() {
        return Keys.LIST_ITEM_PKEY;
    }

    @Override
    public List<UniqueKey<ListItemRecord>> getKeys() {
        return Arrays.<UniqueKey<ListItemRecord>>asList(Keys.LIST_ITEM_PKEY);
    }

    @Override
    public List<ForeignKey<ListItemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ListItemRecord, ?>>asList(Keys.LIST_ITEM__LIST_ITEM_LIST_ID_FKEY);
    }

    public com.apon.elitefour.database.tables.List list() {
        return new com.apon.elitefour.database.tables.List(this, Keys.LIST_ITEM__LIST_ITEM_LIST_ID_FKEY);
    }

    @Override
    public ListItem as(String alias) {
        return new ListItem(DSL.name(alias), this);
    }

    @Override
    public ListItem as(Name alias) {
        return new ListItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ListItem rename(String name) {
        return new ListItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ListItem rename(Name name) {
        return new ListItem(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Integer, Integer, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
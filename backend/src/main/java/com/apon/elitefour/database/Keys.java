/*
 * This file is generated by jOOQ.
 */
package com.apon.elitefour.database;


import com.apon.elitefour.database.tables.FlywaySchemaHistory;
import com.apon.elitefour.database.tables.List;
import com.apon.elitefour.database.tables.ListItem;
import com.apon.elitefour.database.tables.ListItemEliminated;
import com.apon.elitefour.database.tables.Status;
import com.apon.elitefour.database.tables.records.FlywaySchemaHistoryRecord;
import com.apon.elitefour.database.tables.records.ListItemEliminatedRecord;
import com.apon.elitefour.database.tables.records.ListItemRecord;
import com.apon.elitefour.database.tables.records.ListRecord;
import com.apon.elitefour.database.tables.records.StatusRecord;

import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<ListRecord> LIST_PKEY = UniqueKeys0.LIST_PKEY;
    public static final UniqueKey<ListItemRecord> LIST_ITEM_PKEY = UniqueKeys0.LIST_ITEM_PKEY;
    public static final UniqueKey<ListItemEliminatedRecord> LIST_ITEM_ELIMINATED_PKEY = UniqueKeys0.LIST_ITEM_ELIMINATED_PKEY;
    public static final UniqueKey<StatusRecord> STATUS_PKEY = UniqueKeys0.STATUS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ListRecord, StatusRecord> LIST__LIST_STATUS_ID_FKEY = ForeignKeys0.LIST__LIST_STATUS_ID_FKEY;
    public static final ForeignKey<ListItemRecord, ListRecord> LIST_ITEM__LIST_ITEM_LIST_ID_FKEY = ForeignKeys0.LIST_ITEM__LIST_ITEM_LIST_ID_FKEY;
    public static final ForeignKey<ListItemEliminatedRecord, ListItemRecord> LIST_ITEM_ELIMINATED__LIST_ITEM_ELIMINATED_ITEM_ID_FKEY = ForeignKeys0.LIST_ITEM_ELIMINATED__LIST_ITEM_ELIMINATED_ITEM_ID_FKEY;
    public static final ForeignKey<ListItemEliminatedRecord, ListItemRecord> LIST_ITEM_ELIMINATED__LIST_ITEM_ELIMINATED_ELIMINATED_ITEM_ID_FKEY = ForeignKeys0.LIST_ITEM_ELIMINATED__LIST_ITEM_ELIMINATED_ELIMINATED_ITEM_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<ListRecord> LIST_PKEY = Internal.createUniqueKey(List.LIST, "list_pkey", List.LIST.ID);
        public static final UniqueKey<ListItemRecord> LIST_ITEM_PKEY = Internal.createUniqueKey(ListItem.LIST_ITEM, "list_item_pkey", ListItem.LIST_ITEM.ID);
        public static final UniqueKey<ListItemEliminatedRecord> LIST_ITEM_ELIMINATED_PKEY = Internal.createUniqueKey(ListItemEliminated.LIST_ITEM_ELIMINATED, "list_item_eliminated_pkey", ListItemEliminated.LIST_ITEM_ELIMINATED.ITEM_ID, ListItemEliminated.LIST_ITEM_ELIMINATED.ELIMINATED_ITEM_ID);
        public static final UniqueKey<StatusRecord> STATUS_PKEY = Internal.createUniqueKey(Status.STATUS, "status_pkey", Status.STATUS.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<ListRecord, StatusRecord> LIST__LIST_STATUS_ID_FKEY = Internal.createForeignKey(com.apon.elitefour.database.Keys.STATUS_PKEY, List.LIST, "list__list_status_id_fkey", List.LIST.STATUS_ID);
        public static final ForeignKey<ListItemRecord, ListRecord> LIST_ITEM__LIST_ITEM_LIST_ID_FKEY = Internal.createForeignKey(com.apon.elitefour.database.Keys.LIST_PKEY, ListItem.LIST_ITEM, "list_item__list_item_list_id_fkey", ListItem.LIST_ITEM.LIST_ID);
        public static final ForeignKey<ListItemEliminatedRecord, ListItemRecord> LIST_ITEM_ELIMINATED__LIST_ITEM_ELIMINATED_ITEM_ID_FKEY = Internal.createForeignKey(com.apon.elitefour.database.Keys.LIST_ITEM_PKEY, ListItemEliminated.LIST_ITEM_ELIMINATED, "list_item_eliminated__list_item_eliminated_item_id_fkey", ListItemEliminated.LIST_ITEM_ELIMINATED.ITEM_ID);
        public static final ForeignKey<ListItemEliminatedRecord, ListItemRecord> LIST_ITEM_ELIMINATED__LIST_ITEM_ELIMINATED_ELIMINATED_ITEM_ID_FKEY = Internal.createForeignKey(com.apon.elitefour.database.Keys.LIST_ITEM_PKEY, ListItemEliminated.LIST_ITEM_ELIMINATED, "list_item_eliminated__list_item_eliminated_eliminated_item_id_fkey", ListItemEliminated.LIST_ITEM_ELIMINATED.ELIMINATED_ITEM_ID);
    }
}

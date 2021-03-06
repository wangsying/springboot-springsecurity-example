/*
 * This file is generated by jOOQ.
 */
package com.siyuo2o.glass.db.album.tables;


import com.siyuo2o.glass.db.album.Album;
import com.siyuo2o.glass.db.album.Indexes;
import com.siyuo2o.glass.db.album.Keys;
import com.siyuo2o.glass.db.album.tables.records.SysRolePermissionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class SysRolePermission extends TableImpl<SysRolePermissionRecord> {

    private static final long serialVersionUID = -305413588;

    /**
     * The reference instance of <code>album.sys_role_permission</code>
     */
    public static final SysRolePermission SYS_ROLE_PERMISSION = new SysRolePermission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysRolePermissionRecord> getRecordType() {
        return SysRolePermissionRecord.class;
    }

    /**
     * The column <code>album.sys_role_permission.permission_id</code>.
     */
    public final TableField<SysRolePermissionRecord, Integer> PERMISSION_ID = createField("permission_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>album.sys_role_permission.role_id</code>.
     */
    public final TableField<SysRolePermissionRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>album.sys_role_permission</code> table reference
     */
    public SysRolePermission() {
        this(DSL.name("sys_role_permission"), null);
    }

    /**
     * Create an aliased <code>album.sys_role_permission</code> table reference
     */
    public SysRolePermission(String alias) {
        this(DSL.name(alias), SYS_ROLE_PERMISSION);
    }

    /**
     * Create an aliased <code>album.sys_role_permission</code> table reference
     */
    public SysRolePermission(Name alias) {
        this(alias, SYS_ROLE_PERMISSION);
    }

    private SysRolePermission(Name alias, Table<SysRolePermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysRolePermission(Name alias, Table<SysRolePermissionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SysRolePermission(Table<O> child, ForeignKey<O, SysRolePermissionRecord> key) {
        super(child, key, SYS_ROLE_PERMISSION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Album.ALBUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_ROLE_PERMISSION_FK9Q28EWRHNTQEIPL1T04KH1BE7, Indexes.SYS_ROLE_PERMISSION_FKOMXRS8A388BKNVHJOKH440WAQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SysRolePermissionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SysRolePermissionRecord, ?>>asList(Keys.FKOMXRS8A388BKNVHJOKH440WAQ, Keys.FK9Q28EWRHNTQEIPL1T04KH1BE7);
    }

    public SysPermission sysPermission() {
        return new SysPermission(this, Keys.FKOMXRS8A388BKNVHJOKH440WAQ);
    }

    public SysRole sysRole() {
        return new SysRole(this, Keys.FK9Q28EWRHNTQEIPL1T04KH1BE7);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysRolePermission as(String alias) {
        return new SysRolePermission(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysRolePermission as(Name alias) {
        return new SysRolePermission(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysRolePermission rename(String name) {
        return new SysRolePermission(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysRolePermission rename(Name name) {
        return new SysRolePermission(name, null);
    }
}

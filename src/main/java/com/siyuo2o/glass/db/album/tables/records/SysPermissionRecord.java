/*
 * This file is generated by jOOQ.
 */
package com.siyuo2o.glass.db.album.tables.records;


import com.siyuo2o.glass.db.album.enums.SysPermissionResourceType;
import com.siyuo2o.glass.db.album.tables.SysPermission;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SysPermissionRecord extends UpdatableRecordImpl<SysPermissionRecord> implements Record8<Integer, Boolean, String, Long, String, String, SysPermissionResourceType, String> {

    private static final long serialVersionUID = 708500278;

    /**
     * Setter for <code>album.sys_permission.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>album.sys_permission.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>album.sys_permission.available</code>.
     */
    public void setAvailable(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>album.sys_permission.available</code>.
     */
    public Boolean getAvailable() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>album.sys_permission.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>album.sys_permission.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>album.sys_permission.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>album.sys_permission.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>album.sys_permission.parent_ids</code>.
     */
    public void setParentIds(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>album.sys_permission.parent_ids</code>.
     */
    public String getParentIds() {
        return (String) get(4);
    }

    /**
     * Setter for <code>album.sys_permission.permission</code>.
     */
    public void setPermission(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>album.sys_permission.permission</code>.
     */
    public String getPermission() {
        return (String) get(5);
    }

    /**
     * Setter for <code>album.sys_permission.resource_type</code>.
     */
    public void setResourceType(SysPermissionResourceType value) {
        set(6, value);
    }

    /**
     * Getter for <code>album.sys_permission.resource_type</code>.
     */
    public SysPermissionResourceType getResourceType() {
        return (SysPermissionResourceType) get(6);
    }

    /**
     * Setter for <code>album.sys_permission.url</code>.
     */
    public void setUrl(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>album.sys_permission.url</code>.
     */
    public String getUrl() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Boolean, String, Long, String, String, SysPermissionResourceType, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Boolean, String, Long, String, String, SysPermissionResourceType, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SysPermission.SYS_PERMISSION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return SysPermission.SYS_PERMISSION.AVAILABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SysPermission.SYS_PERMISSION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return SysPermission.SYS_PERMISSION.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SysPermission.SYS_PERMISSION.PARENT_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SysPermission.SYS_PERMISSION.PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SysPermissionResourceType> field7() {
        return SysPermission.SYS_PERMISSION.RESOURCE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SysPermission.SYS_PERMISSION.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component2() {
        return getAvailable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getParentIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPermission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionResourceType component7() {
        return getResourceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getAvailable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getParentIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPermission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionResourceType value7() {
        return getResourceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionRecord value2(Boolean value) {
        setAvailable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionRecord value4(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionRecord value5(String value) {
        setParentIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionRecord value6(String value) {
        setPermission(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionRecord value7(SysPermissionResourceType value) {
        setResourceType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionRecord value8(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionRecord values(Integer value1, Boolean value2, String value3, Long value4, String value5, String value6, SysPermissionResourceType value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysPermissionRecord
     */
    public SysPermissionRecord() {
        super(SysPermission.SYS_PERMISSION);
    }

    /**
     * Create a detached, initialised SysPermissionRecord
     */
    public SysPermissionRecord(Integer id, Boolean available, String name, Long parentId, String parentIds, String permission, SysPermissionResourceType resourceType, String url) {
        super(SysPermission.SYS_PERMISSION);

        set(0, id);
        set(1, available);
        set(2, name);
        set(3, parentId);
        set(4, parentIds);
        set(5, permission);
        set(6, resourceType);
        set(7, url);
    }
}
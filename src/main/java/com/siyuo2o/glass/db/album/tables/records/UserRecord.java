/*
 * This file is generated by jOOQ.
 */
package com.siyuo2o.glass.db.album.tables.records;


import com.siyuo2o.glass.db.album.tables.User;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record6<Integer, String, String, String, Byte, String> {

    private static final long serialVersionUID = -511655957;

    /**
     * Setter for <code>album.user.uid</code>.
     */
    public void setUid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>album.user.uid</code>.
     */
    public Integer getUid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>album.user.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>album.user.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>album.user.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>album.user.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>album.user.salt</code>.
     */
    public void setSalt(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>album.user.salt</code>.
     */
    public String getSalt() {
        return (String) get(3);
    }

    /**
     * Setter for <code>album.user.state</code>.
     */
    public void setState(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>album.user.state</code>.
     */
    public Byte getState() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>album.user.username</code>.
     */
    public void setUsername(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>album.user.username</code>.
     */
    public String getUsername() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Byte, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Byte, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return User.USER.UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return User.USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return User.USER.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return User.USER.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return User.USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Integer value) {
        setUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value6(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Integer value1, String value2, String value3, String value4, Byte value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer uid, String name, String password, String salt, Byte state, String username) {
        super(User.USER);

        set(0, uid);
        set(1, name);
        set(2, password);
        set(3, salt);
        set(4, state);
        set(5, username);
    }
}

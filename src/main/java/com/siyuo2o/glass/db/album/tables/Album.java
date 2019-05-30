/*
 * This file is generated by jOOQ.
 */
package com.siyuo2o.glass.db.album.tables;


import com.siyuo2o.glass.db.album.Indexes;
import com.siyuo2o.glass.db.album.Keys;
import com.siyuo2o.glass.db.album.tables.records.AlbumRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Album extends TableImpl<AlbumRecord> {

    private static final long serialVersionUID = -1600613082;

    /**
     * The reference instance of <code>album.album</code>
     */
    public static final Album ALBUM_ = new Album();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AlbumRecord> getRecordType() {
        return AlbumRecord.class;
    }

    /**
     * The column <code>album.album.id</code>.
     */
    public final TableField<AlbumRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>album.album.parent_id</code>.
     */
    public final TableField<AlbumRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>album.album.name</code>.
     */
    public final TableField<AlbumRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>album.album.src</code>.
     */
    public final TableField<AlbumRecord, String> SRC = createField("src", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>album.album.url</code>.
     */
    public final TableField<AlbumRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * Create a <code>album.album</code> table reference
     */
    public Album() {
        this(DSL.name("album"), null);
    }

    /**
     * Create an aliased <code>album.album</code> table reference
     */
    public Album(String alias) {
        this(DSL.name(alias), ALBUM_);
    }

    /**
     * Create an aliased <code>album.album</code> table reference
     */
    public Album(Name alias) {
        this(alias, ALBUM_);
    }

    private Album(Name alias, Table<AlbumRecord> aliased) {
        this(alias, aliased, null);
    }

    private Album(Name alias, Table<AlbumRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Album(Table<O> child, ForeignKey<O, AlbumRecord> key) {
        super(child, key, ALBUM_);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return com.siyuo2o.glass.db.album.Album.ALBUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ALBUM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AlbumRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ALBUM_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AlbumRecord> getPrimaryKey() {
        return Keys.KEY_ALBUM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AlbumRecord>> getKeys() {
        return Arrays.<UniqueKey<AlbumRecord>>asList(Keys.KEY_ALBUM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Album as(String alias) {
        return new Album(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Album as(Name alias) {
        return new Album(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Album rename(String name) {
        return new Album(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Album rename(Name name) {
        return new Album(name, null);
    }
}
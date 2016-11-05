/**
 * This class is generated by jOOQ
 */
package org.graviton.database.jooq.login.tables.records;


import org.graviton.database.jooq.login.tables.Servers;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.5"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ServersRecord extends TableRecordImpl<ServersRecord> implements Record1<String> {

    private static final long serialVersionUID = 1753926092;

    /**
     * Create a detached ServersRecord
     */
    public ServersRecord() {
        super(Servers.SERVERS);
    }

    /**
     * Create a detached, initialised ServersRecord
     */
    public ServersRecord(String key) {
        super(Servers.SERVERS);

        set(0, key);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>login.servers.key</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>login.servers.key</code>.
     */
    public void setKey(String value) {
        set(0, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Servers.SERVERS.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord values(String value1) {
        value1(value1);
        return this;
    }
}

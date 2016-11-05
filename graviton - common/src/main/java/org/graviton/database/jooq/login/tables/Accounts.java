/**
 * This class is generated by jOOQ
 */
package org.graviton.database.jooq.login.tables;


import org.graviton.database.jooq.login.Keys;
import org.graviton.database.jooq.login.Login;
import org.graviton.database.jooq.login.tables.records.AccountsRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


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
public class Accounts extends TableImpl<AccountsRecord> {

    /**
     * The reference instance of <code>login.accounts</code>
     */
    public static final Accounts ACCOUNTS = new Accounts();
    private static final long serialVersionUID = 1226996384;
    /**
     * The column <code>login.accounts.id</code>.
     */
    public final TableField<AccountsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>login.accounts.name</code>.
     */
    public final TableField<AccountsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");
    /**
     * The column <code>login.accounts.password</code>.
     */
    public final TableField<AccountsRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");
    /**
     * The column <code>login.accounts.nickname</code>.
     */
    public final TableField<AccountsRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");
    /**
     * The column <code>login.accounts.question</code>.
     */
    public final TableField<AccountsRecord, String> QUESTION = createField("question", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");
    /**
     * The column <code>login.accounts.answer</code>.
     */
    public final TableField<AccountsRecord, String> ANSWER = createField("answer", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");
    /**
     * The column <code>login.accounts.rights</code>.
     */
    public final TableField<AccountsRecord, Byte> RIGHTS = createField("rights", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");
    /**
     * The column <code>login.accounts.banned</code>.
     */
    public final TableField<AccountsRecord, Byte> BANNED = createField("banned", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");
    /**
     * The column <code>login.accounts.muted</code>.
     */
    public final TableField<AccountsRecord, Byte> MUTED = createField("muted", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");
    /**
     * The column <code>login.accounts.points</code>.
     */
    public final TableField<AccountsRecord, Integer> POINTS = createField("points", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>login.accounts.channels</code>.
     */
    public final TableField<AccountsRecord, String> CHANNELS = createField("channels", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("i*#$p%", org.jooq.impl.SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>login.accounts.last_connection</code>.
     */
    public final TableField<AccountsRecord, String> LAST_CONNECTION = createField("last_connection", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");
    /**
     * The column <code>login.accounts.last_address</code>.
     */
    public final TableField<AccountsRecord, String> LAST_ADDRESS = createField("last_address", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");
    /**
     * The column <code>login.accounts.friend_notification_listener</code>.
     */
    public final TableField<AccountsRecord, Byte> FRIEND_NOTIFICATION_LISTENER = createField("friend_notification_listener", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>login.accounts</code> table reference
     */
    public Accounts() {
        this("accounts", null);
    }

    /**
     * Create an aliased <code>login.accounts</code> table reference
     */
    public Accounts(String alias) {
        this(alias, ACCOUNTS);
    }

    private Accounts(String alias, Table<AccountsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Accounts(String alias, Table<AccountsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountsRecord> getRecordType() {
        return AccountsRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Login.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AccountsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ACCOUNTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccountsRecord> getPrimaryKey() {
        return Keys.KEY_ACCOUNTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccountsRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountsRecord>>asList(Keys.KEY_ACCOUNTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Accounts as(String alias) {
        return new Accounts(alias, this);
    }

    /**
     * Rename this table
     */
    public Accounts rename(String name) {
        return new Accounts(name, null);
    }
}
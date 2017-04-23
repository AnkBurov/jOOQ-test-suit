package app.factory;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import javax.sql.DataSource;

public abstract class DSLContextFactory {

    public DSLContext getDslContext() {
        return DSL.using(getDataSource(), getDialect());
    }

    protected abstract SQLDialect getDialect();

    protected abstract DataSource getDataSource();
}

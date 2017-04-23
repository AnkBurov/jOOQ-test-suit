package app.factory;

import org.jooq.SQLDialect;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

public class PostGreSqlDslContextFactory extends DSLContextFactory {
    @Override
    protected SQLDialect getDialect() {
        return SQLDialect.POSTGRES;
    }

    @Override
    protected DataSource getDataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.postgresql.Driver.class);
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("root");
        return dataSource;
    }
}

package app.factory;

import org.jooq.SQLDialect;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

public class MySqlDslContextFactory extends DSLContextFactory {
    @Override
    protected SQLDialect getDialect() {
        return SQLDialect.MYSQL;
    }

    @Override
    protected DataSource getDataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
}

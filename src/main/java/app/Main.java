package app;

import app.domain.User;
import app.factory.DSLContextFactory;
import app.factory.PostGreSqlDslContextFactory;
import org.jooq.DSLContext;

import java.util.List;

import static app.generated.Tables.CATEGORY;
import static app.generated.Tables.USER;
import static org.jooq.impl.DSL.name;

public class Main {

    public static void main(String[] args) {
        DSLContext dsl = new PostGreSqlDslContextFactory().getDslContext();

        List<User> users = dsl.select(
                USER.ID,
                USER.LOGIN,
                CATEGORY.ID,
                USER.CATEGORY_ID)
                .from(USER)
                .join(CATEGORY).on(USER.CATEGORY_ID.equal(CATEGORY.ID))
                .where(USER.ID.equal(2))
                .fetchInto(User.class);

        users.forEach(System.out::println);

        List<User> users2 = dsl.with(USER.getQualifiedName()
                .fields(USER.ID.getQualifiedName(),
                        USER.LOGIN.getQualifiedName(),
                        USER.CATEGORY_ID.getQualifiedName())
                .as(dsl.select(
                        USER.ID,
                        USER.LOGIN,
                        USER.CATEGORY_ID)
                        .from(USER)
                        .join(CATEGORY).on(USER.CATEGORY_ID.equal(CATEGORY.ID))
                        .where(USER.ID.equal(2))))
                .select()
                .from(USER.getQualifiedName())
                .fetchInto(User.class);

        users2.forEach(System.out::println);

        List<User> users3 = dsl.with("name",
                "id", "login", "CATEGORY_ID")
                .as(dsl.select(
                        USER.ID,
                        USER.LOGIN,
                        USER.CATEGORY_ID)
                        .from(USER)
                        .join(CATEGORY).on(USER.CATEGORY_ID.equal(CATEGORY.ID))
                        .where(USER.ID.equal(2)))
                .select()
                .from(name("name"))
                .fetchInto(User.class);
        users3.forEach(System.out::println);
    }
}

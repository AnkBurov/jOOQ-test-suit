package app;

import org.jooq.DerivedColumnList3;
import org.junit.Test;

import java.lang.reflect.Field;

import static app.generated.Tables.USER;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DerivedColumnListTest {

    @Test
    public void testNameFields() throws Exception {
        DerivedColumnList3 fields = USER.getQualifiedName()
                .fields(USER.ID.getQualifiedName(),
                        USER.LOGIN.getQualifiedName(),
                        USER.CATEGORY_ID.getQualifiedName());

        Field name = fields.getClass()
                .getDeclaredField("name");
        name.setAccessible(true);
        String nameValue = (String) name.get(fields);

        assertEquals(nameValue, USER.getName());

        Field fieldNames = fields.getClass()
                .getDeclaredField("fieldNames");
        fieldNames.setAccessible(true);
        String[] fieldNamesValue = (String[]) fieldNames.get(fields);

        assertArrayEquals(fieldNamesValue, new String[]{USER.ID.getName(),
                USER.LOGIN.getName(),
                USER.CATEGORY_ID.getName()});
    }
}

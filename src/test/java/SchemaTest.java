import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchemaTest {
    @Test
    public void test_boolean() {
        assertEquals(new Schema("l:boolean").getValue("l", null), true);
    }

    @Test
    public void test_integer() {
        assertEquals(new Schema("p:integer").getValue("p", "8080"), 8080);
        assertEquals(new Schema("p:integer").getValue("p", "-9"), -9);
    }

    @Test
    public void test_string() {
        assertEquals(new Schema("d:string").getValue("d", "/usr/log"), "/usr/log");
    }
}

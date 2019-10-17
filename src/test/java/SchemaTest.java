import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SchemaTest {
    @Test
    public void should_test_boolean () {
        Schema schema = new Schema("l:boolean");
        assertEquals(schema.getValue("l", "true"), Boolean.TRUE);
        assertEquals(schema.getValue("l", null), Boolean.TRUE);
        assertEquals(schema.getValue("l", "false"), Boolean.FALSE);
    }

    @Test
    public void should_test_integer () {
        Schema schema = new Schema("p:integer");
        assertEquals(schema.getValue("p", "8080"), 8080);
        assertEquals(schema.getValue("p", "-9"), -9);
    }

    @Test
    public void should_test_String () {
        Schema schema = new Schema("d:string");
        assertEquals(schema.getValue("d", "/usr/log"), "/usr/log");
    }

    @Test
    public void should_test_list () {
        Schema schema = new Schema("r:list");
        assertEquals(Arrays.toString((String [])schema.getValue("r", "this,is,a,list")), "[this, is, a, list]");
    }
}

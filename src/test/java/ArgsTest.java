import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgsTest {
    @Test
    public void test_boolean_without_args() {
        Args args = new Args("l:boolean p:integer d:string", "-l -p 8080 -d /usr/log");
        assertEquals(args.getValue("l"), true);
        assertEquals(args.getValue("p"), 8080);
        assertEquals(args.getValue("d"), "/usr/log");
    }

    @Test
    public void test_boolean_with_value_args() {
        Args args = new Args("l:boolean p:integer d:string", "-l true -p -9 -d /usr/log");
        assertEquals(args.getValue("l"), true);
        assertEquals(args.getValue("p"), -9);
        assertEquals(args.getValue("d"), "/usr/log");
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgsTest {

    @Test
    public void test_easy_args() {
        Args args = new Args("l:boolean p:integer d:string", "-l -p 8080 -d /usr/log");

        assertEquals(args.getValue("l"), new Boolean(true));
        assertEquals(args.getValue("p"), new Integer(8080));
        assertEquals(args.getValue("d"), new String("/usr/log"));
    }
}

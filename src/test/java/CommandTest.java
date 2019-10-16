import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTest {
    @Test
    public void test_noraml_command () {
        Command command = new Command("-l -p 8080 -d /user/log");
        assertEquals(command.getValue("l"), "true");
        assertEquals(command.getValue("p"), "8080");
        assertEquals(command.getValue("d"), "/user/log");
    }

    @Test
    public void test_negative_command () {
        Command command = new Command("-l -p -9 -d /user/log");
        assertEquals(command.getValue("l"), "true");
        assertEquals(command.getValue("p"), "-9");
        assertEquals(command.getValue("d"), "/user/log");
    }
}

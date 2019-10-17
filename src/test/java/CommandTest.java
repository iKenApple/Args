import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTest {
    @Test
    public void test_some_without_value_command () {
        Command command = new Command("-l -p 8080 -d /usr/log");
        assertEquals(command.getValue("l"), null);
        assertEquals(command.getValue("p"), "8080");
        assertEquals(command.getValue("d"), "/usr/log");
    }

    @Test
    public void test_all_with_value_command () {
        Command command = new Command("-l false -p 8080 -d /usr/log");
        assertEquals(command.getValue("l"), "false");
        assertEquals(command.getValue("p"), "8080");
        assertEquals(command.getValue("d"), "/usr/log");
    }


    @Test
    public void test_all_with_value_negative_command () {
        Command command = new Command("-l true -p -9 -d /usr/log");
        assertEquals(command.getValue("l"), "true");
        assertEquals(command.getValue("p"), "-9");
        assertEquals(command.getValue("d"), "/usr/log");
    }
}
